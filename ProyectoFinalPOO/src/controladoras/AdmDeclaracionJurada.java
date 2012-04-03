
package controladoras;

/*import java.util.Calendar;*/
import modelos.DeclaracionJurada;

public class AdmDeclaracionJurada {
    
    public String verificarSiDeclaracionJuradaTieneResponsable(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getResponsable();
    }
    
    
    public String verificarSiDeclaracionJuradaTieneTipo(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getTipo();
    }
        
    public String verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaven();
    }
    
    /*public Calendar verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaven();
    }*/
    
}
