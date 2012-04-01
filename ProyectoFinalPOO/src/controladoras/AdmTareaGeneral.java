/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controladoras;

import java.util.ArrayList;
import modelos.Responsable;
import modelos.TareaGeneral;
import modelos.Tipo;

public class AdmTareaGeneral {
   
    private ArrayList<TareaGeneral> dbTarea = new ArrayList<TareaGeneral>();

    private void simularTabla() {
        this.dbTarea.add(new TareaGeneral("Jhon", "Asunto001", "16/03/2012"));
        this.dbTarea.add(new TareaGeneral("Joaquin", "Asunto002", "16/03/2012"));;
        this.dbTarea.add(new TareaGeneral("Paulo", "Asunto003", "16/03/2012"));;
        this.dbTarea.add(new TareaGeneral("Christian", "Asunto004", "16/03/2012"));;
    }
    
    public boolean verificarAsunto(String asunto) {
        if (asunto!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarResponsable(String responsable) {
        if (responsable!=null) {
            return true;
        }
        return false;
    }
    
}
