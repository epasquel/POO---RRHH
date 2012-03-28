/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import modelos.*;
import controladoras.*;

/**
 *
 * @author student
 */
public class AdmDeclaracionJuradaTest {
    
    public AdmDeclaracionJuradaTest() {
    }

    @Test
    public void siDeclaracionJuradaTieneUnResponsableDevuelveUnMensaje() {
        
        Responsable responsable = new Responsable("Ebert", "Administrador");
        Tipo tipo = new Tipo("Inicio");
        String fechaVencimiento = "19/01/2012";        
        DeclaracionJurada declaracionJurada = new DeclaracionJurada(responsable, tipo, fechaVencimiento);
        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada));
        System.out.println("La Declaración Jurada tiene un responsable");
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnTipoDevuelveUnMensaje() {        
        Responsable responsable = new Responsable("Ebert", "Administrador");
        Tipo tipo = new Tipo("Inicio");
        String fechaVencimiento = "19/01/2012";        
        DeclaracionJurada declaracionJurada = new DeclaracionJurada(responsable, tipo, fechaVencimiento);
        
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneTipo(declaracionJurada));
        System.out.println("La Declaración Jurada tiene un tipo");
    }
    
    @Test
    public void siDeclaracionJuradaTieneFechaDeVencimientoDevuelveMensaje(){
        Responsable responsable = new Responsable("Ebert", "Administrador");
        Tipo tipo = new Tipo("Inicio");
        String fechaVencimiento = "19/01/2012";        
        DeclaracionJurada declaracionJurada = new DeclaracionJurada(responsable, tipo, fechaVencimiento);
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertNotNull(admDeclaracionJurada.verificarSiDeclaracionJuradaTieneFechaDeVencimiento(declaracionJurada));
        System.out.println("La Declaración Jurada tiene fecha de vencimiento");
    }
    
}
