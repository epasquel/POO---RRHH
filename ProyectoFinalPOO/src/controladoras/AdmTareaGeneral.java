
package controladoras;

import java.util.ArrayList;
/*import java.util.Calendar;*/
import modelos.TareaGeneral;
import modelos.Usuario;

public class AdmTareaGeneral {

    private static ArrayList<TareaGeneral> valores = new ArrayList<TareaGeneral>();

    public static ArrayList<TareaGeneral> getArrayTareaGeneral() {
        return valores;
    }

    public ArrayList<TareaGeneral> getValores() {
        return valores;
    }

    public int getCantidadValores() {
        return valores.size();
    }

    /*public void registrarTareaGeneral(String asunto, String responsable, String comentario, Calendar fechaven)*/
    public void registrarTareaGeneral(String asunto, String responsable, String comentario, String fechaven) {
        int estado = 0;
        int usuario = 0;
        for (TareaGeneral TareaGeneral : valores) {
            if (TareaGeneral.getAsunto().equals(asunto)) {
                estado = 1;
            }
        }
        for (Usuario Usuario : AdmUsuario.getArrayUsuario()) {
            if (Usuario.getDni().equals(responsable)) {
                usuario = 1;
            }
        }
        if (estado == 0 && usuario == 1) {
            TareaGeneral objDato = new TareaGeneral(asunto, responsable, comentario, fechaven);
            valores.add(objDato);
            System.out.println("La tarea general ha sido registrada satisfactoriamente.");
        } else if (estado == 1) {
            System.out.println("La tarea general ingresada ya existe, por favor verifique.");
        } else if (usuario == 0) {
            System.out.println("El usuario responsable no existe, por favor verifique.");
        }
    }

    public void eliminarTareaGeneral(String asunto) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getAsunto();
            if (asunto.equals(condicion)) {
                valores.remove(i);
                System.out.println("[" + asunto + "] Registro eliminado.");
            }
        }
    }

    public void buscarTareaGeneral(String asunto) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getAsunto();
            if (asunto.equals(condicion)) {
                System.out.println("[" + asunto + "] Registro buscado.");
                System.out.println("Asunto: " + valores.get(i).getAsunto());
                System.out.println("Responsable: " + valores.get(i).getResponsable());
                System.out.println("[" + asunto + "] Registro encontrado.");
            }
        }
    }

    public void listarTareasGenerales() {
        int cantidadElementos = valores.size();
        String nombreResponsable = "";
        String paternoResponsable = "";
        String maternoResponsable = "";
        String completoResponsable = "";
        for (int aux = 0; aux < cantidadElementos; aux++) {
            System.out.println("Asunto : " + valores.get(aux).getAsunto());
            System.out.println("Fecha de Vencimiento : " + valores.get(aux).getFechaven());
            System.out.println("Comentario : " + valores.get(aux).getComentario());
            System.out.println("Responsable Dni : " + valores.get(aux).getResponsable());
            // Importante para relacionar Responsable Dni y su Responsable Nombre Completo ///////////////
            for (Usuario unUsuario : AdmUsuario.getArrayUsuario()) {
                if (unUsuario.getDni().equals(valores.get(aux).getResponsable())) {
                    nombreResponsable = unUsuario.getNombre();
                    paternoResponsable = unUsuario.getApellidoPaterno();
                    maternoResponsable = unUsuario.getApellidoMaterno();
                    completoResponsable = nombreResponsable + " " + paternoResponsable + " " + maternoResponsable;
                }
            }
            System.out.println("Responsable Nombre : " + completoResponsable);
            System.out.println("");
        }
    }
    private void simularTabla() {
        this.registrarTareaGeneral("Limpieza", "44623909", "Limpieza en el segmento A", "13/04/2012");
        this.registrarTareaGeneral("Supervisor", "44623910", "Supervision de calles", "26/04/2012");
        this.registrarTareaGeneral("Dictar clases", "44623911", "Atencion en el aula 302", "30/04/2012");
        this.registrarTareaGeneral("Tutoria", "44623912", "Aseoria para alumnos de pregrado", "10/05/2012");
    }
    
    public boolean verificarAsunto(String asunto) {
        if (asunto!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarResponsable(String responsable) {
        if (responsable!=null) {
            return true;
        }
        return false;
    }
}
