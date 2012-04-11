
package controladoras;

import appinterfaces.IDocumento;
import java.util.ArrayList;
import modelos.Documento;
import modelos.Responsable;
import modelos.Usuario;


public abstract class AdmDocumentos implements IDocumento{

    public abstract String adicionar();
    public abstract String adicionarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios);
    public abstract Documento asignarTarea(Documento documento, Responsable responsable);
    public abstract Documento buscar(String numDocumento);
    public abstract Documento editar(String numDocumento);
    public abstract String eliminar(String numDocumento);
    public abstract String eliminarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios);
    
}
