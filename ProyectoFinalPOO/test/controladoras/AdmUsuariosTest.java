package controladoras;


import controladoras.AdmUsuario;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;
import modelos.Permisos;
import modelos.Rol;

public class AdmUsuariosTest {
    
    AdmUsuario admUsuarios = new AdmUsuario();
    
    
    @Test
    public void siNoIngresoElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacío");
    }  
    
      @Test
    public void siNoIngresoElPassMeDebeDarError(){
        assertFalse(admUsuarios.verificarPassw(null));
        System.out.println("Password no debe estar vacío");
    }  
         
      
    @Test
    public void siIngresoElUsuarioDebeAceptarlo(){
        assertTrue(admUsuarios.verificarUsuario("sklante"));
        System.out.println("Usuario ingresado");
    }
         @Test
    public void siIngresoElPasswDebeAceptarlo(){
        assertTrue(admUsuarios.verificarPassw("123456"));
        System.out.println("Password ingresado");
    }          
            
    @Test
    public void siElUsuarioNoExisteDebeMandarMensaje(){
        assertNull(admUsuarios.existeUsuario("angel"));
        System.out.println("Usuario Inexistente");
    }

         @Test
        public void siElPassNoExisteDebeMandarMensaje(){
            assertNull(admUsuarios.existePassw("123457"));
            System.out.println("Error al ingresar el password");
    }
       
    @Test
    public void siElUsuarioExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existeUsuario("sklante"));
        System.out.print("usario existente");
    }
    
     @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("sklante","123456"));
        System.out.println("usted a ingresado correctamente");
    }
    
       
    @Test
        
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(admUsuarios.validarPassword("sklante", "1234596"));
            
        System.out.println("El password ingresado es incorrecto, por favor ingresar nuevamente el password");


    }
     @Test
        
    public void eliminarUsuario(){
         
         Permisos permisos = new Permisos(true, true, true, true);
         Rol newRol= new Rol(permisos);
     admUsuarios.registrarUsuario("44623912", "Miguel", "Peñaran", "Escalante", "sklante", "mpeñaran@hotmail.com", "01/04/2012", "MiCargo", newRol, "Arquitecto");
           assertEquals(4 ,admUsuarios.getValores().size()); 
        System.out.println("El usuario ha sido eliminado");

 
  
}
}
   
    
    
