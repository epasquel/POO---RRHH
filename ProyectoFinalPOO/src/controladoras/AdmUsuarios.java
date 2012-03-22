package controladoras;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.Usuario;

public class AdmUsuarios {

    private ArrayList<Usuario> dbUsuarios = new ArrayList<Usuario>();

    private void simularTabla() {
        this.dbUsuarios.add(new Empleado("001", "4578541","Miguel", "Peñaran", "escalante", "sk@hotmail.com", "12-02-2012", "sklante", "123456"));
        this.dbUsuarios.add(new Empleado("002", "4578541","Juan", "Gallegos", "Collado", "sk@hotmail.com", "12-02-2012", "jgallegos", "12345"));
        this.dbUsuarios.add(new Empleado("003", "4551541","escalante","MOGOLLON", "ASCUE", "sk@hotmail.com", "12-02-2012", "emogollon", "1234"));
        this.dbUsuarios.add(new Empleado("004", "4552458", "L","Dancuart", "Fernandez", "sk@hotmail.com", "12-02-2012", "dfernandez", "123"));
        this.dbUsuarios.add(new Empleado("005", "5445215","Oré", "Brañez", "alexanders", "sk@hotmail.com", "12-02-2012", "obranes", "2222"));
        this.dbUsuarios.add(new Empleado("006", "4545218","Raúl", "Calderón", "escalante", "sk@hotmail.com", "12-02-2012", "rcalderon", "1111"));
    }

    public boolean verificarUsuario(String user) {
        if (user != null) {
            return true;
        }
        return false;
    }

    public boolean verificarPassw(String password) {
        if (password != null) {
            return true;
        }
        return false;
    }

    public Usuario existeUsuario(String userName) {
        simularTabla();
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : dbUsuarios) {
            if (usuario.getUserName().equals(userName)) {
                usuarioEncontrado = usuario;
            }
        }
        return usuarioEncontrado;
    }

    public Usuario existePassw(String password) {
        simularTabla();
        Usuario passwEncontrado = null;
        for (Usuario passw : dbUsuarios) {
            if (passw.getPassword().equals(password)) {
                passwEncontrado = passw;
            }
        }
        return passwEncontrado;
    }

    public boolean validarPassword(String userName, String password) {
        boolean acceso = false;
        
        Usuario usuarioValido = existeUsuario(userName);
        if (usuarioValido.getPassword().equals(password)) {
            acceso = true;
        }
        return acceso;
    }
    
    
}
