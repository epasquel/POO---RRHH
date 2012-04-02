
package modelos;

import java.util.ArrayList;
import java.util.Calendar;


public class DeclaracionJurada extends Documento{
        
    private String tipo;
    private Calendar fechaAsumpcion;
    private Calendar fechaReferencia;
    private Calendar fechaPublicacion;
    private Calendar fechaDocumento;
    private String numDocumento;

    
        public DeclaracionJurada(String tipo, Calendar fechaVen, String responsable){
        super(fechaVen, responsable);
        this.tipo = tipo;
    }
           
    public String getComentario(){
        return comentario;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public Calendar getFechaAsumpcion() {
        return fechaAsumpcion;
    }

    public void setFechaAsumpcion(Calendar fechaAsumpcion) {
        this.fechaAsumpcion = fechaAsumpcion;
    }

    public Calendar getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Calendar fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public Calendar getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Calendar fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Calendar getFechaReferencia() {
        return fechaReferencia;
    }

    public void setFechaReferencia(Calendar fechaReferencia) {
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
