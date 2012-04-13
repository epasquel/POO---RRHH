/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AdmRecordatorioTest {

    @Test
    public void siRecordatorioTieneUnResponsableDevuelveTrue() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        assertTrue(admRecordatorio.verificarSiRecordatorioTieneUnResponsable(recordatorio));
        System.out.println("____Test_siRecordatorioTieneUnResponsableDevuelveTrue_");
        System.out.println("El Recordatorio " + recordatorio.getNumDocumento() + " puede ser asignado");

    }

    @Test
    public void siRecordatorioTieneTareaDevuelveTrue() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        assertTrue(admRecordatorio.verificarSiRecordatorioTieneTarea(recordatorio));
        System.out.println("____Test_siRecordatorioTieneTareaDevuelveTrue_");
        System.out.println("El Recordatorio tiene una tarea");
    }

    @Test
    public void siRecordatorioTieneFechaDeVencimientoDevuelveTrue() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        assertTrue(admRecordatorio.verificarSiRecordatorioTieneFechaDeVencimiento(recordatorio));
        System.out.println("____Test_siRecordatorioTieneFechaDeVencimientoDevuelveTrue_");
        System.out.println("El Recordatorio tiene fecha de vencimiento");
    }

    @Test
    public void siCamposObligatoriosParaGrabarRecordatorioEstanIngresadosPuedoGrabar() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        assertTrue(admRecordatorio.verificarCamposObligatoriosParaGrabarRecordatorio(recordatorio));
        System.out.println("____Test_siCamposObligatoriosParaGrabarRecordatorioEstanIngresadosPuedoGrabar_");
        System.out.println("Puede grabar la tarea");
    }

    @Test
    public void siCamposObligatoriosParaGrabarTareaNoEstanIngresadosPuedoGrabar() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = new Recordatorio(null, null, null);
        assertFalse(admRecordatorio.verificarCamposObligatoriosParaGrabarRecordatorio(recordatorio));
        System.out.println("____Test_siCamposObligatoriosParaGrabarTareaNoEstanIngresadosPuedoGrabar_");
        System.out.println("No se puede grabar el Recordatorio");
    }

    @Test
    public void siRecordatorioTieneUnResponsablePuedoAsignarLaTarea() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        assertTrue(admRecordatorio.verificarSiRecordatorioTieneUnResponsable(recordatorio));
        System.out.println("____Test_siRecordatorioTieneUnResponsablePuedoAsignarLaTarea_");
        System.out.println("El Recordatorio " + recordatorio.getNumDocumento() + " puede ser asignado");
    }

    @Test
    public void siListaDeUsuariosNoEsNullPuedoNotificarTareaAUsuarios() {

        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();
        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("crengifo");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("epasquel");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }
        recordatorio.setListUsuario(listUsuarios);
        assertNotNull(admRecordatorio.verificarListaDeUsuarios(recordatorio));
        System.out.println("____Test_siListaDeUsuariosNoEsNullPuedoNotificarTareaAUsuarios_");
        System.out.println("Estos son los usuarios a notificar :" + admRecordatorio.verificarListaDeUsuarios(recordatorio));
    }

    //Métodos de las historias de usuarios//
    @Test
    public void adicionarCreaNuevaTareaControlRecordatorio() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        assertEquals("Nuevo documento", admRecordatorio.adicionar());
        System.out.println("____Test_adicionarCreaNuevaTareaControlRecordatorio_");
        System.out.println(admRecordatorio.adicionar());
    }

    @Test
    public void buscarRecordatorioPorNumeroMeDevuelveUnMensaje() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admRecordatorio.buscar("R002"));
        System.out.println("____Test_buscarRecordatorioPorNumeroMeDevuelveUnMensaje_");
        System.out.println("Se ha encontrado el Recordatorio " + admRecordatorio.buscar("R002").getNumDocumento());
    }

    @Test
    public void buscarRecordatorioPorNumeroParaEditar() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admRecordatorio.buscar("R001"));
        System.out.println("____Test_buscarRecordatorioPorNumeroParaEditar_");
        System.out.println("El Recordatorio " + admRecordatorio.buscar("R001").getNumDocumento() + " se puede editar");
    }

    @Test
    public void eliminarRecordatorioPorNumero() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        //CartaFianza cartaFianza = admCartaFianza.generarData();
        assertNotNull(admRecordatorio.eliminar("R002"));
        System.out.println("____Test_eliminarRecordatorioPorNumero_");
        System.out.println(admRecordatorio.eliminar("R002"));
    }

    @Test
    public void asignarTareaMeMuestraSuResponsable() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarDataSinResponsable();
        Responsable responsable = new Responsable("Noelia", "Ilustradora");
        assertNotNull(admRecordatorio.asignarTarea(recordatorio, responsable));
        System.out.println("____Test_asignarTareaMeMuestraSuResponsable_");
        System.out.println("ElRecordatorio " + recordatorio.getNumDocumento() + " tiene como responsable a " + recordatorio.getResponsable().getNombre());
    }

    @Test
    public void mostrarLosUsuatiosANotificar() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarData();

        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("epasquel");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("acuru");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }

        assertNotNull(admRecordatorio.adicionarUsuarioYNotificar(recordatorio, listUsuarios));
        System.out.println("____Test_mostrarLosUsuatiosANotificar_");
        System.out.println("Los usuarios asignados son " + admRecordatorio.adicionarUsuarioYNotificar(recordatorio, listUsuarios));
    }

    @Test
    public void mostrarUsuariosEliminadosDeLasNotificaciones() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarDataConUsuariosAsignados();

        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("sklante");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("crengifo");
        if (usuario != null) {
            listUsuarios.add(usuario);
        }

        assertNotNull(admRecordatorio.eliminarUsuarioYNotificar(recordatorio, listUsuarios));
        System.out.println("____Test_mostrarUsuariosEliminadosDeLasNotificaciones_");
        System.out.println("Los usuarios eliminados son " + admRecordatorio.adicionarUsuarioYNotificar(recordatorio, listUsuarios));
    }
    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void mostrarRecordatorioAResponsable() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarDataSinResponsable();
        Responsable responsable = new Responsable("Noelia", "Ilustradora");
        assertNotNull(admRecordatorio.asignarTarea(recordatorio, responsable));
        System.out.println("");
        System.out.println("____Test_mostrarRecordatorioAResponsable_");
        System.out.println("============================================================");
        System.out.println("Recordatorio " + recordatorio.getNumDocumento());
        System.out.println(recordatorio.getTarea().getAsunto());
        System.out.println("Vencimiento: " + recordatorio.getFechaven());
        System.out.println("Responsable: " + recordatorio.getResponsable().getNombre());
        System.out.println("============================================================");
        System.out.println("");
    }

    @Test
    public void cambiarEstadoARecordatorio() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarDataSinResponsable();
        Responsable responsable = new Responsable("Noelia", "Ilustradora");
        assertNotNull(admRecordatorio.asignarTarea(recordatorio, responsable));
        System.out.println("");
        System.out.println("____Test_cambiarEstadoARecordatorio_");
        System.out.println("============================================================");
        System.out.println("Recordatorio " + recordatorio.getNumDocumento());
        System.out.println(recordatorio.getTarea().getAsunto());
        System.out.println("Vencimiento: " + recordatorio.getFechaven());
        System.out.println("Responsable: " + recordatorio.getResponsable().getNombre());
        System.out.println("Estado inicial: " + recordatorio.getEstado());
        //recordatorio.setEstado("En curso");
        recordatorio.setEstado("Completado");
        //recordatorio.setEstado("Descartado");
        System.out.println("Nuevo estado: " + recordatorio.getEstado());
        System.out.println("============================================================");
        System.out.println("");
    }

    @Test
    public void siEstadoDeRecordatorioEsCompletadoODescartadoYaNoMuestraMensaje() {
        AdmRecordatorio admRecordatorio = new AdmRecordatorio();
        Recordatorio recordatorio = admRecordatorio.generarDataSinResponsable();
        Responsable responsable = new Responsable("Noelia", "Ilustradora");
        assertNotNull(admRecordatorio.asignarTarea(recordatorio, responsable));
        //recordatorio.setEstado("En curso");
        //recordatorio.setEstado("Completado");
        recordatorio.setEstado("Descartado");
        System.out.println("");
        System.out.println("____Test_siEstadoDeRecordatorioEsCompletoODescartadoYaNoMuestraMensaje_");
        if (recordatorio.getEstado().equals("Completado") || recordatorio.getEstado().equals("Descartado")) {
            System.out.println("============================================================");
            System.out.println("No se muestra mensaje porque el estado es: " + recordatorio.getEstado());
            System.out.println("============================================================");
        } else {
            System.out.println("============================================================");
            System.out.println("Recordatorio " + recordatorio.getNumDocumento());
            System.out.println(recordatorio.getTarea().getAsunto());
            System.out.println("Vencimiento: " + recordatorio.getFechaven());
            System.out.println("Responsable: " + recordatorio.getResponsable().getNombre());
            System.out.println("Estado: " + recordatorio.getEstado());
            System.out.println("============================================================");
        }
        System.out.println("");
    }
}
