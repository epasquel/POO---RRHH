/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.Calendar;
import modelos.DeclaracionJurada;

/**
 *
 * @author student
 */
public class AdmDeclaracionJurada {
    
    public String verificarSiDeclaracionJuradaTieneResponsable(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getResponsable();
    }
    
    
    public String verificarSiDeclaracionJuradaTieneTipo(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getTipo();
    }
    
    public Calendar verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaven();
    }
    
}
