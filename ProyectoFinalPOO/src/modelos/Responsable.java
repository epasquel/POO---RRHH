
package modelos;


public class Responsable {
    
    private String nombre;

    public Responsable(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    private String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
