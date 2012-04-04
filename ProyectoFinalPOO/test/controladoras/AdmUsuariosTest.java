package controladoras;


import controladoras.AdmUsuario;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;

public class AdmUsuariosTest {
    
    AdmUsuario admUsuarios = new AdmUsuario();
    
    
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
        assertNotNull(admUsuarios.existeUsuario("mpeñaran"));
        System.out.print("Usuario Existe");
    }
     @Test
     public void siElPasswExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existePassw("123456"));
        System.out.print("Password Existe");
    } 
       
    @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("mpeñaran","123456"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
        
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(admUsuarios.validarPassword("mpeñaran", "Arquitecto"));
            
        System.out.println("Acceso NO Aceptado");
    }
     @Test
    public void testear() throws ParseException{
        System.out.println("probando fecha" + admUsuarios.convertirFecha("21/04/2012"));
        System.out.println("probando fecha" + admUsuarios.convertirFecha("10/12/2012"));
        System.out.println("probando fecha" + admUsuarios.convertirFecha("05/01/2012"));
    }    
}
