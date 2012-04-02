/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;


public class Rol {
    private String nombre;
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
    }   
}
