
package controladoras;

import java.util.ArrayList;
import modelos.Rol;
import modelos.Usuario;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import controladoras.AdmUsuario;
import modelos.Permisos;

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

    public void registrarUsuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, Rol rol, String password) {
        int estado = 0;
        for (Usuario Usuario : valores) {
            if (Usuario.getDni().equals(dni)) {
                estado = 1;
            }
        }
        
        if (estado == 0) {
            Usuario objDato = new Usuario(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, password);
            valores.add(objDato);
            
        } else if (estado == 1) {
           
        }
    }
     public void eliminarrUsuario(String dni) {
        int estado = 0;
        for (Usuario Usuario : valores) {
            if (Usuario.getDni().equals(dni)) {
                estado = 1;
            }
        }
        
        if (estado == 0) {
                    valores.remove(estado);            
        } 
     
        }
    
   /* public void eliminarUsuario(String nombre) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getDni();
            if (nombre.equals(condicion)) {
                valores.remove(i);
                System.out.println("[" + nombre + "] Registro eliminado.");
            }
        }
    }*/

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
            System.out.println("Rol : " + valores.get(aux).getRol());
            // Importante para relacionar Rol y su Descripcion ///////////////
            /*for (Rol unRol : AdmRol.getArrayRol()) {
                if (unRol.getNombre().equals(valores.get(aux).getRol().getNombre())) {
                    descripcionRol = unRol.getDescripcion();
                }
            }*/
            System.out.println("Descripcion de Rol : " + descripcionRol);
            System.out.println("");
        }
    }
    
    public void simularTabla(){
         /*  private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String usuario;
    private String correo;
    private String fechaIngreso;
    private String cargo;
    private Rol rol;
    private String password;
    private String descripcionRol;*/
        Permisos permisos = new Permisos(true, false, true, true);
        Rol rol = new Rol(permisos);
        this.registrarUsuario("44623909", "Agustin", "Curu", "Hinostroza", "acuru", "acuruh@hotmail.com", "01/04/2012", "MiCargo", rol, "Administrador");
        permisos = new Permisos(false, true, false, true);
        rol = new Rol(permisos);
        this.registrarUsuario("44623910", "Ebert", "Pasquel", "Paucar", "epasquel", "epasquel@hotmail.com", "01/04/2012", "MiCargo", rol, "Supervisor");
        permisos = new Permisos(false, true, false, true);
        rol = new Rol(permisos);
        this.registrarUsuario("44623911", "Carlos", "Rengifo", "Florindez", "crengifo", "crengifo@hotmail.com", "01/04/2012", "MiCargo", rol, "Contador");
        permisos = new Permisos(false, true, false, true);
        rol = new Rol(permisos);
        this.registrarUsuario("44623912", "Miguel", "Peñaran", "Escalante", "sklante", "mpeñaran@hotmail.com", "01/04/2012", "MiCargo", rol, "Arquitecto");
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
     public boolean validarUsuario(String nombre){
        if(nombre != null){
            return true;
        }
        return false;
    }
        public boolean validarDNI(String dni){
        if(dni != null){
            return true;
        }
        return false;
    }
        public boolean validarApellidoPaterno(String apePat){
        if (apePat != null){
            return true;
        }
        return false;
    }
    
    public boolean validarApellidoMatermo(String apeMat){
        if (apeMat != null){
            return true;
        }
        return false;
    }
    public boolean validarCorreo(String correo){
        if (correo != null){
            return true;
        }
        return false;
    }
       public boolean validarFecha(Date fIngreso){
        if (fIngreso != null){
            return true;
        }
        return false;
    }
         public boolean validarCargo(String cargo){
        if (cargo != null){
            return true;
        }
        return false;
    }
    
    public boolean validarCodigoRol(String codigoRol){
        if (codigoRol != null){
            return true;
        }
        return false;
    }
     public Date convertirFecha(String fecha) throws ParseException {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Date d1 = df.parse(fecha);
        return d1;
    }
     void eliminarUsuario(String dni){
       AdmUsuario.valores.remove(dni);       
     }
}


