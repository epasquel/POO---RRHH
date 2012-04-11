
package modelos;

/*import java.util.Calendar;*/


public class TareaGeneral extends Documento {
    private String asunto;

    /*public TareaGeneral(String asunto, String responsable, String comentario, Calendar fechaven)*/
    public TareaGeneral(String asunto, Responsable responsable, String comentario, String fechaven) {
        //super(fechaven, responsable);
        this.fechaven = fechaven;
        this.responsable = responsable;
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }
    
}
