
package controladoras;
import java.util.ArrayList;
import modelos.Empleado;
import modelos.Cargo;

public class AdmEmpleado {
      private ArrayList<Cargo> dbCargo= new ArrayList<Cargo>();
       private void simularTablaCargo() {
        this.dbCargo.add(new Cargo("001", "123456"));
    
    }
}
