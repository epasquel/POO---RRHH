
package controladoras;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import modelos.*;
import java.util.Calendar;

/**
 *
 * @author student
 */
public class AdmDeclaracionJuradaTest {
       
    @Test
    public void siDeclaracionJuradaTieneUnResponsableDevuelveTrue() {
                        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData();        
        assertTrue(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada));
        System.out.println("La Declaración " + declaracionJurada.getNumDocumento() + " puede ser asignada");
        
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnTipoDevuelveTrue() {        
               
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData();
        assertTrue(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneTipo(declaracionJurada));
        System.out.println("La Declaración Jurada tiene un tipo");
    }
    
    @Test
    public void siDeclaracionJuradaTieneFechaDeVencimientoDevuelveTrue(){        
        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData();
        assertTrue(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneFechaDeVencimiento(declaracionJurada));
        System.out.println("La Declaración Jurada tiene fecha de vencimiento");
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaEstanIngresadosPuedoGrabar(){
                
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData();
        assertTrue(admDeclaracionJurada.verificarCamposObligatoriosParaGrabarTarea(declaracionJurada));
        System.out.println("Puede grabar la tarea");
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaNoEstanIngresadosPuedoGrabar(){
                
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = new DeclaracionJurada(null, null, null);
        assertFalse(admDeclaracionJurada.verificarCamposObligatoriosParaGrabarTarea(declaracionJurada));
        System.out.println("No se puede grabar la Declaración Jurada");
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnResponsablePuedoAsignarLaTarea() {
                        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData();        
        assertTrue(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada));
        System.out.println("La Declaración " + declaracionJurada.getNumDocumento() + " puede ser asignada");
    }
    
    @Test
    public void siListaDeUsuariosNoEsNullPuedoNotificarTareaAUsuarios(){        
        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarData(); 
        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("epasquel");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("acuru");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        declaracionJurada.setListUsuario(listUsuarios);
        assertNotNull(admDeclaracionJurada.verificarListaDeUsuarios(declaracionJurada));
        System.out.println("Estos son los usuarios a notificar :" +  admDeclaracionJurada.verificarListaDeUsuarios(declaracionJurada));
    }
}
