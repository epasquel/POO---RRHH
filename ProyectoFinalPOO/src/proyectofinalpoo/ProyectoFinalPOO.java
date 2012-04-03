
package proyectofinalpoo;

import controladoras.AdmRol;
import controladoras.AdmTareaGeneral;
import controladoras.AdmUsuario;

public class ProyectoFinalPOO {

    public static void main(String[] args) {
        // Registrar usuarios //
        AdmUsuario AdmUsuario = new AdmUsuario();
        AdmUsuario.registrarUsuario("44623909", "Agustin", "Curu", "Hinostroza", "acuru", "acuruh@hotmail.com", "01/04/2012", "MiCargo", "Administrador", "123456");
        AdmUsuario.registrarUsuario("44623910", "Ebert", "Pasquel", "Paucar", "epasquel", "epasquel@hotmail.com", "01/04/2012", "MiCargo", "Supervisor", "123456");
        AdmUsuario.registrarUsuario("44623911", "Carlos", "Rengifo", "Florindez", "crengifo", "crengifo@hotmail.com", "01/04/2012", "MiCargo", "Contador", "123456");
        AdmUsuario.registrarUsuario("44623912", "Miguel", "Escalante", "Z", "mescalante", "mescalante@hotmail.com", "01/04/2012", "MiCargo", "Arquitecto", "123456");
        // Registrar roles //
        AdmRol AdmRol = new AdmRol();
        AdmRol.registrarRol("Administrador", "Administrador Del Sitio");
        AdmRol.registrarRol("Supervisor", "Supervisor Del Sitio");
        AdmRol.registrarRol("Contador", "Contador Del Sitio");
        AdmRol.registrarRol("Arquitecto", "Arquitecto Del Sitio");

        // Imprimir lista de usuarios //
        System.out.println("========= Lista de usuarios =========");
        AdmUsuario.listarUsuarios();
        System.out.println("");
        // Eliminar usuario //
        System.out.println("========= Eliminar usuarios =========");
        String dni_eliminar = "44623909";
        AdmUsuario.eliminarUsuario(dni_eliminar);
        System.out.println("");
        // Buscar usuario //
        System.out.println("========= Buscar usuarios =========");
        String dni_buscar = "44623910";
        AdmUsuario.buscarUsuario(dni_buscar);
        System.out.println("");
        // Imprimir nueva lista de usuarios //
        System.out.println("========= Nueva lista de usuarios =========");
        AdmUsuario.listarUsuarios();
        System.out.println("");

        // Imprimir lista de roles //
        System.out.println("========= Lista de roles =========");
        AdmRol.listarRoles();
        System.out.println("");
        // Eliminar rol //
        System.out.println("========= Eliminar roles =========");
        String nombre_eliminar = "Arquitecto";
        AdmRol.eliminarRol(nombre_eliminar);
        System.out.println("");
        // Buscar rol //
        System.out.println("========= Buscar roles =========");
        String nombre_buscar = "Contador";
        AdmRol.buscarRol(nombre_buscar);
        System.out.println("");
        // Imprimir nueva lista de roles //
        System.out.println("========= Lista de roles =========");
        AdmRol.listarRoles();
        System.out.println("");

        // Registrar tareas //
        AdmTareaGeneral AdmTareaGeneral = new AdmTareaGeneral();
        AdmTareaGeneral.registrarTareaGeneral("Limpieza", "44623909", "Limpieza en el segmento A", "13/04/2012");
        AdmTareaGeneral.registrarTareaGeneral("Supervisor", "44623910", "Supervision de calles", "26/04/2012");
        AdmTareaGeneral.registrarTareaGeneral("Dictar clases", "44623911", "Atencion en el aula 302", "30/04/2012");
        AdmTareaGeneral.registrarTareaGeneral("Tutoria", "44623912", "Aseoria para alumnos de pregrado", "10/05/2012");
        // Imprimir lista de tareas //
        System.out.println("========= Lista de tareas =========");
        AdmTareaGeneral.listarTareasGenerales();
        System.out.println("");
        // Eliminar tarea //
        System.out.println("========= Eliminar tareas =========");
        String tarea_eliminar = "Tutoria";
        AdmTareaGeneral.eliminarTareaGeneral(tarea_eliminar);
        System.out.println("");
        // Buscar tarea //
        System.out.println("========= Buscar tareas =========");
        String tarea_buscar = "Supervisor";
        AdmTareaGeneral.buscarTareaGeneral(tarea_buscar);
        System.out.println("");
        // Imprimir nueva lista de roles //
        System.out.println("========= Lista de tareas =========");
        AdmTareaGeneral.listarTareasGenerales();
        System.out.println("");
    }
}
