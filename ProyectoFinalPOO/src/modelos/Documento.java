/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.ArrayList;
import java.util.Calendar;


public class Documento {
    
    protected Calendar fechaven;
    protected String responsable;
    protected String comentario;
    protected ArrayList<Usuario> listUsuario;
    protected Calendar fechaCreacion;
    protected String usuCreacion;
    protected String fecActualizacion;
    protected String usuActualizacion;

    public Documento(Calendar fechaven, String responsable) {
        this.fechaven = fechaven;
        this.responsable = responsable; 
        listUsuario = new ArrayList<Usuario>();
    }        

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(String fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Calendar getFechaven() {
        return fechaven;
    }

    public void setFechaven(Calendar fechaven) {
        this.fechaven = fechaven;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUsuActualizacion() {
        return usuActualizacion;
    }

    public void setUsuActualizacion(String usuActualizacion) {
        this.usuActualizacion = usuActualizacion;
    }

    public String getUsuCreacion() {
        return usuCreacion;
    }

    public void setUsuCreacion(String usuCreacion) {
        this.usuCreacion = usuCreacion;
    }


    
    
    
    public void buscar(String responsable) {
        // buscar por responsable
    }

    public void adicionar() {
        // parece que no es posible tener un metodo en comun porque hay campos distintos
    }
    
    public void editar() {
        // parece que no es posible tener un metodo en comun porque hay campos distintos
    }

    public void eliminar(String responsable) {
        // buscar por responsable y eliminar
    }
    
    public void asignarTarea(Usuario usuario) {
        
    }

    public void adicionarUsuarioYNotificar(Usuario usuario) {
        
    }
    
    public void eliminarUsuarioYNotificar(Usuario usuario) {
        
    }
    
    
}
