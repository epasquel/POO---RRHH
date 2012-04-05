
package modelos;

import java.util.ArrayList;
/*import java.util.Calendar;*/


public class Documento {
    
    /*protected Calendar fechaven;*/
    protected String fechaven;
    protected Responsable responsable;
    protected String comentario;
    protected ArrayList<Usuario> listUsuario;
    /*protected Calendar fechaCreacion;*/
    protected String fechaCreacion;
    protected String usuCreacion;
    protected String fecActualizacion;
    protected String usuActualizacion;

    /*public Documento(Calendar fechaven, String responsable)*/
    public Documento(String fechaven, Responsable responsable) {
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

    /*public Calendar getFechaCreacion()*/
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /*public void setFechaCreacion(Calendar fechaCreacion)*/
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /*public Calendar getFechaven()*/
    public String getFechaven() {
        return fechaven;
    }

    /*public void setFechaven(Calendar fechaven)*/
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
}
