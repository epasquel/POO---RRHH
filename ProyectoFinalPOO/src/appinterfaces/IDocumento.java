/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appinterfaces;

/**
 *
 * @author Administrador
 */
public interface IDocumento {
    public String getCodigo(); // no definido o getResponsable();  
    public abstract String buscar();    
    public abstract String adicionar();
    public abstract String editar();
    public abstract String eliminar();
    public abstract String asignarTarea();
    public abstract String adicionarUsuarioYNotificar();
    public abstract String eliminarUsuarioYNotificar();
}
