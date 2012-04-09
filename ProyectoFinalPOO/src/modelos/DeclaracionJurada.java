
package modelos;

import java.util.ArrayList;
/*import java.util.Calendar;*/


public class DeclaracionJurada extends Documento{
        
    private String tipo;
    /*private Calendar fechaAsumpcion;
    private Calendar fechaReferencia;
    private Calendar fechaPublicacion;
    private Calendar fechaDocumento;*/
    private String fechaAsumpcion;
    private String fechaReferencia;
    private String fechaPublicacion;
    private String fechaDocumento;
    private String numDocumento;
     private String fechaVencimiento;
private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    
    /*public DeclaracionJurada(String tipo, Calendar fechaVen, String responsable)*/
    public DeclaracionJurada(String tipo, String fechaVen, Responsable responsable) {
        super(fechaVen, responsable);
        this.tipo = tipo;
    }    
       
//    @Override
    public String getComentario(){
        return comentario;
    }
    
//    @Override
    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    /*public Calendar getFechaAsumpcion()*/
    public String getFechaAsumpcion() {
        return fechaAsumpcion;
    }

    /*public void setFechaAsumpcion(Calendar fechaAsumpcion)*/
    public void setFechaAsumpcion(String fechaAsumpcion){
        this.fechaAsumpcion = fechaAsumpcion;
    }

    /*public Calendar getFechaDocumento()*/
    public String getFechaDocumento(){
        return fechaDocumento;
    }

    /*public void setFechaDocumento(Calendar fechaDocumento)*/
    public void setFechaDocumento(String fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    /*public Calendar getFechaPublicacion()*/
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /*public void setFechaPublicacion(Calendar fechaPublicacion)*/
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /*public Calendar getFechaReferencia()*/
    public String getFechaReferencia() {
        return fechaReferencia;
    }

    /*public void setFechaReferencia(Calendar fechaReferencia)*/
    public void setFechaReferencia(String fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
