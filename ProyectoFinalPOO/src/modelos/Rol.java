
package modelos;

public class Rol {

    public Rol(Permisos permisos, String nombre, String descripcion) {
        this.permisos = permisos;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    private Permisos permisos;
    private String nombre;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }
    



    
}
   
