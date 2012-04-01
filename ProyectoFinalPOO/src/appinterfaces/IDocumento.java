/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appinterfaces;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Administrador
 */
public interface IDocumento {
    public String getCodigo(); // no definido   
    public abstract String buscar();    
    public abstract String adicionar();
    public abstract String editar();
    public abstract String eliminar();
}
