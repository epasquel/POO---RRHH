/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appinterfaces;

import java.util.ArrayList;
import modelos.Documento;
import modelos.Responsable;
import modelos.Usuario;

/**
 *
 * @author Administrador
 */
public interface IDocumento { 
    public abstract Documento buscar(String numDocumento);    
    public abstract String adicionar();
    public abstract Documento editar(String numDocumento);
    public abstract String eliminar(String numDocumento);
    public abstract Documento asignarTarea(Documento documento, Responsable responsable);
    public abstract String adicionarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios);
    public abstract String eliminarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios);
}
