/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.Calendar;


public abstract class Documento {
    protected String responsable; // Esto sera su dni. Para mostrarlo se armara cadena Nombre + Paterno + Materno
    protected String comentario;
    protected String fechaven;
    protected Usuario usuario; // Usuarios que seran notificados.

    public Documento(String responsable, String comentario, String fechaven) {
        this.responsable = responsable;
        this.comentario = comentario;
        this.fechaven = fechaven;
    }

    public String getComentario() {
        return comentario;
    }

    public String getFechaven() {
        return fechaven;
    }

    public String getResponsable() {
        return responsable;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}
