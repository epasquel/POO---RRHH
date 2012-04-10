
package modelos;

public class Permisos {
    private boolean Acceso;
    private boolean Adicionar;
    private boolean Editar;
    private boolean Eliminar;

    public Permisos(boolean Acceso, boolean Adicionar, boolean Editar, boolean Eliminar) {
        this.Acceso = Acceso;
        this.Adicionar = Adicionar;
        this.Editar = Editar;
        this.Eliminar = Eliminar;
    }

    public boolean isAcceso() {
        return Acceso;
    }

    public void setAcceso(boolean Acceso) {
        this.Acceso = Acceso;
    }

    public boolean isAdicionar() {
        return Adicionar;
    }

    public void setAdicionar(boolean Adicionar) {
        this.Adicionar = Adicionar;
    }

    public boolean isEditar() {
        return Editar;
    }

    public void setEditar(boolean Editar) {
        this.Editar = Editar;
    }

    public boolean isEliminar() {
        return Eliminar;
    }

    public void setEliminar(boolean Eliminar) {
        this.Eliminar = Eliminar;
    }
    
}
