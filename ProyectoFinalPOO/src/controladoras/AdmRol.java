
package controladoras;

import java.util.ArrayList;
import modelos.Modulo;
import modelos.Permisos;
import modelos.Rol;

public class AdmRol {
    
    
    
    public ArrayList<Rol> simularTablaRoles()        
    {
        ArrayList<Rol> listRoles = new ArrayList<Rol>();
        Modulo modulo = new Modulo("M001", "Administracion de Usuarios");
        Permisos permisos = new Permisos(modulo, true, true, true, true);
        Rol rol = new Rol(permisos,"Administrador", "Administrador");
        listRoles.add(rol);
        
        modulo = new Modulo("M002", "Control de Declaracion Jurada");
        permisos = new Permisos(modulo, true, true, true, false);
        rol = new Rol(permisos, "UsuarioRRHH", "Usuario de RRHH");
        listRoles.add(rol);
        
        modulo = new Modulo("M003", "Control de Carta Fianza");
        permisos = new Permisos(modulo, true, true, true, false);
        rol = new Rol(permisos, "UsuarioLogistica", "Usuario de Logística");
        listRoles.add(rol);
        
        modulo = new Modulo("M004", "Control de Tarea General");
        permisos = new Permisos(modulo, true, true, true, false);
        rol = new Rol(permisos, "Empleado", "Empleado de servir");
        listRoles.add(rol);
        
       
        
        return listRoles;
        
    }
    
    
    public Rol Adicionar() {
        Modulo modulo = new Modulo("M001", "Administracion de Usuarios");
        Permisos permisos = new Permisos(modulo, true, true, true, true);
        Rol rol = new Rol(permisos,"Administrador", "Administrador");
        return rol;
    }
    
    public Rol buscarRol(String nombre){
        Rol rol= null;
        ArrayList<Rol> listaRol = simularTablaRoles();
        
        for (Rol rol2 : listaRol){
            if(rol2.getNombre().equals(nombre)){
                rol = rol2;
            }
        }
        return rol;
    }
    
     public String Eliminar(String nombre) {
        Rol rol= null;
        ArrayList<Rol> listaRol = simularTablaRoles();
        String mensaje = ""; 
        for (Rol rol2 : listaRol){
            if(rol2.getNombre().equals(nombre)){
                rol = rol2;
                mensaje = rol.getNombre();
            }
        }
        listaRol.remove(rol);
        
        return "Se ha eliminado el rol" + mensaje;
    }
    
    /*en el assert not null*/
}


/*import java.util.ArrayList;
import modelos.Rol;


public class AdmRol {
    private static ArrayList<Rol> valores = new ArrayList<Rol>();

    public static ArrayList<Rol> getArrayRol() {
        return valores;
    }
    
    public ArrayList<Rol> getValores() {
        return valores;
    }

    public int getCantidadValores() {
        return valores.size();
    }

    public void registrarRol(String nombre, String descripcion) {
        int estado = 0;
        for (Rol rol : valores) {
            if (rol.getNombre().equals(nombre)) {
                estado = 1;
            }
        }
        
        if (estado == 0) {
            Rol objDato = new Rol(nombre, descripcion);
            valores.add(objDato);
            System.out.println("El Rol ha sido registrado satisfactoriamente.");
        } else if (estado == 1) {
            System.out.println("El Rol ingresado ya existe, por favor verifique.");
        }
    }

    public void eliminarRol(String nombre) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getNombre();
            if (nombre.equals(condicion)) {
                valores.remove(i);
                System.out.println("[" + nombre + "] Registro eliminado.");
            }
        }
    }

    public void buscarRol(String nombre) {
        for (int i = 0; i < this.valores.size(); i++) {
            String condicion = valores.get(i).getNombre();
            if (nombre.equals(condicion)) {
                System.out.println("[" + nombre + "] Registro buscado.");
                System.out.println("Nombre: " + valores.get(i).getNombre());
                System.out.println("Descripcion: " + valores.get(i).getDescripcion());
                System.out.println("[" + nombre + "] Registro encontrado.");
            }
        }
    }
    
    public void listarRoles(){
        int cantidadElementos = valores.size();
        for(int aux=0; aux < cantidadElementos; aux++){
            System.out.println("Nombre de Rol : " + valores.get(aux).getNombre());
            System.out.println("Descripcion de Rol : " + valores.get(aux).getDescripcion());
            System.out.println("");
        }
    }
    
}*/
