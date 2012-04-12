
package controladoras;

import modelos.Rol;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hammer
 */
public class AdmRolTest {
    
    public AdmRolTest() {
    }

    @Test
    public void adicionarMedevuelveUnObjetoDelTipoRol() {
        AdmRol admRol = new AdmRol();
        assertNotNull(admRol.Adicionar());
        System.out.println("Se ha adicionado un nuevo rol");
    }
    
    @Test
    public void editarMedevuelveUnObjetoDelTipoRol() {
        AdmRol admRol = new AdmRol();
        Rol rol = admRol.buscarRol("Administrador");
        assertNotNull(admRol.buscarRol("Administrador"));
        rol.setNombre("Administradores");
        System.out.println("El rol " + admRol.buscarRol("Administrador").getNombre() +  " ha sido editado a " + rol.getNombre());
    }
    
}
