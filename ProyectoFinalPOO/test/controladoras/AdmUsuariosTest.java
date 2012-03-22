package controladoras;

import controladoras.AdmUsuarios;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
    
    
    @Test
    public void siNoIngresoElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacío");
    }  
    
      @Test
    public void siNoIngresoElPassMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Password no debe estar vacío");
    }  
         
      
            
    @Test
    public void siIngresoElUsuarioDebeAceptarlo(){
        assertTrue(admUsuarios.verificarUsuario("sklante"));
        System.out.println("Usuario ingresado");
    }
    /*Verificar que Password no es null*/
    
    
    
     @Test
    public void siIngresoElPasswDebeAceptarlo(){
        assertTrue(admUsuarios.verificarPassw("123456"));
        System.out.println("Password ingresado");
    }          
    
    @Test
    public void siElUsuarioNoExisteDebeMandarMensaje(){
        assertNull(admUsuarios.existeUsuario("adriem"));
        System.out.println("Usuario Inexistente");
    }
        
         @Test
        public void siElPassNoExisteDebeMandarMensaje(){
            assertNull(admUsuarios.existePassw("1234567"));
            System.out.println("Password Inexistente");
    }
       
    
    @Test
    public void siElUsuarioExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existeUsuario("sklante"));
        System.out.print("Usuario Existe");
    }
     @Test
     public void siElPasswExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existePassw("123456"));
        System.out.print("Password Existe");
    } 
       
    @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("sklante","123456"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
        
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(admUsuarios.validarPassword("sklante", "123454464"));
        System.out.println("Acceso NO Aceptado");
    }
        
}
