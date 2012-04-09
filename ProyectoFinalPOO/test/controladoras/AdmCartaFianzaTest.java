/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.CartaFianza;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author student
 */
public class AdmCartaFianzaTest {
    
    public AdmCartaFianzaTest() {
    }

    @Test
    public void siDeclaracionJuradaTieneNumeroDeDocumentoDevuelveTrue() {
                        
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();        
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneNumeroDocumento(cartaFianza));
        System.out.println("El número del documento es " + cartaFianza.getNumDocumento());
        
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnProveedorDevuelveTrue() {        
               
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneProveedor(cartaFianza));
        System.out.println("El proveedor de la Carta Fianza es : " + cartaFianza.getProveedor().getNombre());
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaEstanIngresadosPuedoGrabar(){
                
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarCamposObligatoriosParaGrabarTarea(cartaFianza));
        System.out.println("Puede grabar la tarea");
    }
    
    @Test
    public void siCartaFianzaTieneNumContratoDevuelveTrue(){        
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneNumContrato(cartaFianza));
        System.out.println("El # de contrato de la Carta Fianza es : " + cartaFianza.getNumContrato());    
    }
    
    @Test
    public void siCartaFianzaTieneUnBancoEmisorDevuelveTrue(){        
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneUnBancoEmisor(cartaFianza));
        System.out.println("El Banco emisor de la Carta Fianza es : " + cartaFianza.getBancoEmisor().getNombre());    
    }
    
    @Test
    public void siCartaFianzaTieneTipoDevuelveTrue(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneTipo(cartaFianza));
        System.out.println("El Tipo de la Carta Fianza es : " + cartaFianza.getBancoEmisor().getNombre());
    }
    
    @Test
    public void siCartaFianzaTieneImporteTrue(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneImporte(cartaFianza));
        System.out.println("El Importe de la Carta Fianza es : " + String.valueOf(cartaFianza.getImporte()));
    }   
    
    @Test
    public void siCartaFianzaTieneFechaDeVencimiento(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneFechaDeVencimiento(cartaFianza));
        System.out.println("La Fecha de Vencimiento de la Carta Fianza es : " + cartaFianza.getFechaven());
    }     
    
    @Test
    public void siCartaFianzaTieneUnProveedor(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarSiCartaFianzaTieneUnResponsable(cartaFianza));
        System.out.println("El responsable de la Carta Fianza es : " + cartaFianza.getResponsable().getNombre());
    }
    
    @Test
    public void siCamposObligatoriosParaAsignarTareaEstanIngresadosPuedoAsignarla(){
                
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        assertTrue(admCartaFianza.verificarCamposObligatoriosParaGrabarTarea(cartaFianza));
        System.out.println("Documento asignado a : " + cartaFianza.getResponsable().getNombre());
    }
    
}
