
package modelos;

public class Rol {
    
    private Permisos permisos;

    public Rol(Permisos permisos) {
        this.permisos = permisos;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }
    
}
    
    /*private String nombre;
    private String descripcion;

    public Rol(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }*/
