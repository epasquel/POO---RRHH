
package modelos;

public class Roles {
      private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
       private String rol;

    public Roles(String codigo, String rol) {
        this.codigo = codigo;
        this.rol = rol;
    }
}
