/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

public class Recordatorio extends Documento {

    private TareaGeneral tarea;
    private String estado;

    public Recordatorio(TareaGeneral tarea, String fechaVen, Responsable responsable) {
        this.tarea = tarea;
        this.fechaven = fechaVen;
        this.responsable = responsable;
    }

    public TareaGeneral getTarea() {
        return tarea;
    }

    public void setTarea(TareaGeneral tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*
     * public Calendar getFechaven()
     */
    public String getFechaven() {
        return fechaven;
    }

    /*
     * public void setFechaven(Calendar fechaven)
     */
    public void setFechaven(String fechaven) {
        this.fechaven = fechaven;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
}
