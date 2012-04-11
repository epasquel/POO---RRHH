/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.CartaFianza;
import modelos.Responsable;
import modelos.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
    //Métodos de las historias de usuarios//
    
    @Test
    public void adicionarCreaNuevoTipoControlCartaFianza(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        assertEquals("Nuevo documento", admCartaFianza.adicionar());
        System.out.println(admCartaFianza.adicionar());
    }
    
    @Test
    public void buscarCartaFianzaPorNumeroMeDevuelveUnMensaje(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admCartaFianza.buscar("CF001"));
        System.out.println("Se ha encontrado la Carta Fianza " + admCartaFianza.buscar("CF001").getNumDocumento());
    }
    
    @Test
    public void buscarCartaFianzaPorNumeroParaEditar(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admCartaFianza.buscar("CF002"));
        System.out.println("La Carta Fianza " + admCartaFianza.buscar("CF002").getNumDocumento() + " se puede editar");
    }
    
    @Test
    public void eliminarCartaFianzaPorNumero(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admCartaFianza.eliminar("CF002"));
        System.out.println(admCartaFianza.eliminar("CF002"));
    }  
    
    @Test
    public void asignarTareaMeMuestraSuResponsable(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarDataSinResponsable();
        Responsable responsable = new Responsable("Ebert", "Contador");
        assertNotNull(admCartaFianza.asignarTarea(cartaFianza, responsable));
        System.out.println("La Carta Fianza " + cartaFianza.getNumDocumento() + " tiene como responsable a " + cartaFianza.getResponsable().getNombre());
    }
    
    @Test
    public void mostrarLosUsuatiosANotificar(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarData();
        
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
        
        assertNotNull(admCartaFianza.adicionarUsuarioYNotificar(cartaFianza, listUsuarios));
        System.out.println("Los usuarios asignados son " + admCartaFianza.adicionarUsuarioYNotificar(cartaFianza, listUsuarios));
    }
    
    @Test
    public void mostrarUsuariosEliminadosDeLasNotificaciones(){
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        CartaFianza cartaFianza = admCartaFianza.generarDataConUsuariosAsignados();
        
        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("sklante");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("crengifo");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        
        assertNotNull(admCartaFianza.eliminarUsuarioYNotificar(cartaFianza, listUsuarios));
        System.out.println("Los usuarios eliminados son " + admCartaFianza.adicionarUsuarioYNotificar(cartaFianza, listUsuarios));
    }
    
}
