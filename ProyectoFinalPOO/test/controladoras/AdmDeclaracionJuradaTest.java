
package controladoras;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import modelos.*;
import controladoras.*;
import java.util.Calendar;

/**
 *
 * @author student
 */
public class AdmDeclaracionJuradaTest {
    
    public AdmDeclaracionJuradaTest() {
    }

    private DeclaracionJurada generarData(){
        
        Responsable responsable = new Responsable("Ebert", "Administrador");
        String tipo = "Inicio";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
        DeclaracionJurada objDec = new DeclaracionJurada(tipo, fechaVencimiento, responsable);
        return objDec;
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnResponsableDevuelveUnMensaje() {
                
        DeclaracionJurada declaracionJurada = generarData();        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada));
        System.out.println("La Declaración Jurada tiene un responsable");
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnTipoDevuelveUnMensaje() {        
       
        DeclaracionJurada declaracionJurada = generarData();      
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneTipo(declaracionJurada));
        System.out.println("La Declaración Jurada tiene un tipo");
    }
    
    @Test
    public void siDeclaracionJuradaTieneFechaDeVencimientoDevuelveMensaje(){        
        DeclaracionJurada declaracionJurada = generarData();
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneFechaDeVencimiento(declaracionJurada));
        System.out.println("La Declaración Jurada tiene fecha de vencimiento");
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaEstanIngresadosPuedoGrabar(){
        DeclaracionJurada declaracionJurada = generarData();        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertTrue(admDeclaracionJurada.verificarCamposObligatoriosParaGrabarTarea(declaracionJurada));
        System.out.println("Puede grabar la tarea");
    }
    
    @Test
    public void siCamposObligatoriosParaAsignarTareaEstanIngresadosPuedoGrabar(){
    
        
    }
}
