
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
    
    //Métodos de las historias de usuarios//
    
    @Test
    public void adicionarCreaNuevoTipoControlCartaFianza(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        assertEquals("Nuevo documento", admDeclaracionJurada.adicionar());
        System.out.println(admDeclaracionJurada.adicionar());
    }
    
    @Test
    public void buscarCartaFianzaPorNumeroMeDevuelveUnMensaje(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admDeclaracionJurada.buscar("DC002"));
        System.out.println("Se ha encontrado la Carta Fianza " + admDeclaracionJurada.buscar("DC002").getNumDocumento());
    }
    
    @Test
    public void buscarDeclaracionJuradaPorNumeroParaEditar(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admDeclaracionJurada.buscar("DC001"));
        System.out.println("La Carta Fianza " + admDeclaracionJurada.buscar("DC001").getNumDocumento() + " se puede editar");
    }
    
    @Test
    public void eliminarDeclaracionJuradaPorNumero(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admDeclaracionJurada.eliminar("DC002"));
        System.out.println(admDeclaracionJurada.eliminar("DC002"));
    }  
    
    @Test
    public void asignarTareaMeMuestraSuResponsable(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarDataSinResponsable();
        Responsable responsable = new Responsable("Ebert", "Contador");
        assertNotNull(admDeclaracionJurada.asignarTarea(declaracionJurada, responsable));
        System.out.println("La Carta Fianza " + declaracionJurada.getNumDocumento() + " tiene como responsable a " + declaracionJurada.getResponsable().getNombre());
    }
    
    @Test
    public void mostrarLosUsuatiosANotificar(){
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
        
        assertNotNull(admDeclaracionJurada.adicionarUsuarioYNotificar(declaracionJurada, listUsuarios));
        System.out.println("Los usuarios asignados son " + admDeclaracionJurada.adicionarUsuarioYNotificar(declaracionJurada, listUsuarios));
    }    
    
    @Test
    public void mostrarUsuariosEliminadosDeLasNotificaciones(){
        AdmDeclaracionJurada admDeclaracionJurada = new AdmDeclaracionJurada();
        DeclaracionJurada declaracionJurada = admDeclaracionJurada.generarDataConUsuariosAsignados();
        
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
        
        assertNotNull(admDeclaracionJurada.eliminarUsuarioYNotificar(declaracionJurada, listUsuarios));
        System.out.println("Los usuarios eliminados son " + admDeclaracionJurada.adicionarUsuarioYNotificar(declaracionJurada, listUsuarios));
    }    
    
}
