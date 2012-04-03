
package controladoras;

import java.util.ArrayList;
import modelos.Rol;
import modelos.Usuario;


public class AdmUsuario {
    private static ArrayList<Usuario> valores = new ArrayList<Usuario>();

    public static ArrayList<Usuario> getArrayUsuario() {
        return valores;
    }
    
    public ArrayList<Usuario> getValores() {
        return valores;
    }

    public int getCantidadValores() {
        return valores.size();
    }

    public void registrarUsuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String nombreRol, String password) {
        int estado = 0;
        for (Usuario Usuario : valores) {
            if (Usuario.getDni().equals(dni)) {
                estado = 1;
            }
        }
        
        if (estado == 0) {
            Usuario objDato = new Usuario(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, nombreRol, password);
            valores.add(objDato);
            System.out.println("El Usuario ha sido registrado satisfactoriamente.");
        } else if (estado == 1) {
            System.out.println("El Usuario ingresado ya existe, por favor verifique.");
        }
    }
    
    public void eliminarUsuario(String nombre) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getDni();
            if (nombre.equals(condicion)) {
                valores.remove(i);
                System.out.println("[" + nombre + "] Registro eliminado.");
            }
        }
    }

    public void buscarUsuario(String nombre) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getDni();
            if (nombre.equals(condicion)) {
                System.out.println("[" + nombre + "] Registro buscado.");
                System.out.println("Nombre: " + valores.get(i).getNombre());
                System.out.println("Paterno: " + valores.get(i).getApellidoPaterno());
                System.out.println("[" + nombre + "] Registro encontrado.");
            }
        }
    }
    
    public void listarUsuarios(){
        int cantidadElementos = valores.size();
        String descripcionRol = "";
        for(int aux=0; aux < cantidadElementos; aux++){
            System.out.println("Dni : " + valores.get(aux).getDni());
            System.out.println("Nombre : " + valores.get(aux).getNombre());
            System.out.println("Materno : " + valores.get(aux).getApellidoPaterno());
            System.out.println("Paterno : " + valores.get(aux).getApellidoMaterno());
            System.out.println("Rol : " + valores.get(aux).getRol().getNombre());
            // Importante para relacionar Rol y su Descripcion ///////////////
            for (Rol unRol : AdmRol.getArrayRol()) {
                if (unRol.getNombre().equals(valores.get(aux).getRol().getNombre())) {
                    descripcionRol = unRol.getDescripcion();
                }
            }
            System.out.println("Descripcion de Rol : " + descripcionRol);
            System.out.println("");
        }
    }
    
    public void simularTabla(){
        this.registrarUsuario("44623909", "Agustin", "Curu", "Hinostroza", "acuru", "acuruh@hotmail.com", "01/04/2012", "MiCargo", "Administrador", "123456");
        this.registrarUsuario("44623910", "Ebert", "Pasquel", "Paucar", "epasquel", "epasquel@hotmail.com", "01/04/2012", "MiCargo", "Supervisor", "123456");
        this.registrarUsuario("44623911", "Carlos", "Rengifo", "Florindez", "crengifo", "crengifo@hotmail.com", "01/04/2012", "MiCargo", "Contador", "123456");
        this.registrarUsuario("44623912", "Miguel", "Peñaran", "Escalante", "mpeñaran", "mpeñaran@hotmail.com", "01/04/2012", "MiCargo", "Arquitecto", "123456");
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
        for (Usuario usuario : valores) {
            if (usuario.getUsuario().equals(userName)) {
                usuarioEncontrado = usuario;
            }
        }
        return usuarioEncontrado;
    }

    public Usuario existePassw(String password) {
        simularTabla();
        Usuario passwEncontrado = null;
        for (Usuario passw : valores) {
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
