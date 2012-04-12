
package modelos;

import java.util.ArrayList;
/*import java.util.Calendar;*/


public class TareaGeneral extends Documento {
    
    private String asunto;
        
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    //    @Override
    public String getComentario(){
        return comentario;
    }
    
//    @Override
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public TareaGeneral(String asunto, String fechaVen, Responsable responsable) {
        this.asunto = asunto;
        this.fechaven = fechaVen;
        this.responsable = responsable;
    }
       
}
