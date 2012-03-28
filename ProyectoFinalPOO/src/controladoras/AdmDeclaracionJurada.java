/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.DeclaracionJurada;
import modelos.*;

/**
 *
 * @author student
 */
public class AdmDeclaracionJurada {
    
    public Responsable verificarSiDeclaracionJuradaTieneResponsable(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getResponsable();
    }
    
    
    public Tipo verificarSiDeclaracionJuradaTieneTipo(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getTipo();
    }
    
    public String verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        return declaracionJurada.getFechaVencimiento();
    }
    
}
