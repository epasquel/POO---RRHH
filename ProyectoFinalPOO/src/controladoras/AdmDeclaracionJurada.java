
package controladoras;

/*import java.util.Calendar;*/
import modelos.DeclaracionJurada;
import modelos.Responsable;

public class AdmDeclaracionJurada {
    
    public String verificarSiDeclaracionJuradaTieneResponsable(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getResponsable().getNombre();
    }
    
    
    public String verificarSiDeclaracionJuradaTieneTipo(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getTipo();
    }
        
    public String verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaven();
    }
    
    public Boolean verificarCamposObligatoriosParaGrabarTarea(DeclaracionJurada declaracionJurada){
        Boolean succes = false;
        if ((verificarSiDeclaracionJuradaTieneFechaDeVencimiento(declaracionJurada) != "") & (verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada) != "") & (verificarSiDeclaracionJuradaTieneTipo(declaracionJurada) != "")){
            succes = true;
        }
        return succes;
    }
    /*public Calendar verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaven();
    }*/
    
}
