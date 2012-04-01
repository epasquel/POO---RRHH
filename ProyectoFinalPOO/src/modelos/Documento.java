/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.ArrayList;
import java.util.Calendar;


public class Documento {
    protected Calendar fechaven;
    protected String responsable;
    protected String comentario;
    protected Usuario usuario;

    public Documento(Calendar fechaven, String responsable, String comentario, Usuario usuario) {
        this.fechaven = fechaven;
        this.responsable = responsable;
        this.comentario = comentario;
        this.usuario = usuario;
    }

    public void buscar(String responsable) {
        // buscar por responsable
    }

    public void adicionar() {
        // parece que no es posible tener un metodo en comun porque hay campos distintos
    }
    
    public void editar() {
        // parece que no es posible tener un metodo en comun porque hay campos distintos
    }

    public void eliminar(String responsable) {
        // buscar por responsable y eliminar
    }
    
    public void asignarTarea(Usuario usuario) {
        
    }

    public void adicionarUsuarioYNotificar(Usuario usuario) {
        
    }
    
    public void eliminarUsuarioYNotificar(Usuario usuario) {
        
    }
    
    
}
