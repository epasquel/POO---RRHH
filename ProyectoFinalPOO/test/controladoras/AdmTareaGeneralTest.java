/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.TareaGeneral;
import modelos.Responsable;
import modelos.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class AdmTareaGeneralTest {
    
    @Test
    public void siTareaGeneralTieneUnResponsableDevuelveTrue() {
                        
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();        
        assertTrue(admTareaGeneral.verificarSiTareaGeneralTieneResponsable(tareaGeneral));
        System.out.println("La Tarea General " + tareaGeneral.getNumDocumento() + " puede ser asignada");
        
    }
    
    @Test
    public void siTareaGeneralTieneUnAsuntoDevuelveTrue() {        
               
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();
        assertTrue(admTareaGeneral.verificarSiTareaGeneralTieneAsunto(tareaGeneral));
        System.out.println("La Tarea General tiene un asunto");
    }
    
    @Test
    public void siTareaGeneralTieneFechaDeVencimientoDevuelveTrue(){        
        
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();
        assertTrue(admTareaGeneral.verificarSiTareaGeneralTieneFechaDeVencimiento(tareaGeneral));
        System.out.println("La Tarea General tiene fecha de vencimiento");
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaEstanIngresadosPuedoGrabar(){
                
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();
        assertTrue(admTareaGeneral.verificarCamposObligatoriosParaGrabarTarea(tareaGeneral));
        System.out.println("Puede grabar la tarea");
    }
    
    @Test
    public void siCamposObligatoriosParaGrabarTareaNoEstanIngresadosPuedoGrabar(){
                
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = new TareaGeneral(null, null, null);
        assertFalse(admTareaGeneral.verificarCamposObligatoriosParaGrabarTarea(tareaGeneral));
        System.out.println("No se puede grabar la Tarea General");
    }
    
    @Test
    public void siDeclaracionJuradaTieneUnResponsablePuedoAsignarLaTarea() {
                        
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();        
        assertTrue(admTareaGeneral.verificarSiTareaGeneralTieneResponsable(tareaGeneral));
        System.out.println("La Tarea General " + tareaGeneral.getNumDocumento() + " puede ser asignada");
    }
    
    @Test
    public void siListaDeUsuariosNoEsNullPuedoNotificarTareaAUsuarios(){        
        
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData(); 
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
        tareaGeneral.setListUsuario(listUsuarios);
        assertNotNull(admTareaGeneral.verificarListaDeUsuarios(tareaGeneral));
        System.out.println("Estos son los usuarios a notificar :" +  admTareaGeneral.verificarListaDeUsuarios(tareaGeneral));
    }
    
    //Métodos de las historias de usuarios//
    
    @Test
    public void adicionarCreaNuevoTipoControlTareaGeneral(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        assertEquals("Nuevo documento", admTareaGeneral.adicionar());
        System.out.println(admTareaGeneral.adicionar());
    }
    
    @Test
    public void buscarTareaGeneralPorNumeroMeDevuelveUnMensaje(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admTareaGeneral.buscar("T002"));
        System.out.println("Se ha encontrado la Tarea General " + admTareaGeneral.buscar("T002").getNumDocumento());
    }
    
    @Test
    public void buscarTareaGeneralPorNumeroParaEditar(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admTareaGeneral.buscar("T001"));
        System.out.println("La Tarea General " + admTareaGeneral.buscar("T001").getNumDocumento() + " se puede editar");
    }
    
    @Test
    public void eliminarTareaGeneralPorNumero(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admTareaGeneral.eliminar("T002"));
        System.out.println(admTareaGeneral.eliminar("T002"));
    }  
    
    @Test
    public void asignarTareaMeMuestraSuResponsable(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarDataSinResponsable();
        Responsable responsable = new Responsable("Ebert", "Contador");
        assertNotNull(admTareaGeneral.asignarTarea(tareaGeneral, responsable));
        System.out.println("La Tarea General " + tareaGeneral.getNumDocumento() + " tiene como responsable a " + tareaGeneral.getResponsable().getNombre());
    }
    
    @Test
    public void mostrarLosUsuatiosANotificar(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarData();
        
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
        
        assertNotNull(admTareaGeneral.adicionarUsuarioYNotificar(tareaGeneral, listUsuarios));
        System.out.println("Los usuarios asignados son " + admTareaGeneral.adicionarUsuarioYNotificar(tareaGeneral, listUsuarios));
    }    
    
    @Test
    public void mostrarUsuariosEliminadosDeLasNotificaciones(){
        AdmTareaGeneral admTareaGeneral = new AdmTareaGeneral();
        TareaGeneral tareaGeneral = admTareaGeneral.generarDataConUsuariosAsignados();
        
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
        
        assertNotNull(admTareaGeneral.eliminarUsuarioYNotificar(tareaGeneral, listUsuarios));
        System.out.println("Los usuarios eliminados son " + admTareaGeneral.adicionarUsuarioYNotificar(tareaGeneral, listUsuarios));
    }
    
}
