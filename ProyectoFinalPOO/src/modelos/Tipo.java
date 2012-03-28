
package modelos;


public class Tipo {
    
    public Tipo(String desTipo){
        this.desTipo = desTipo;
    }
    
    private String codTipo;

    public String getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
    }

    public String getDesTipo() {
        return desTipo;
    }

    public void setDesTipo(String desTipo) {
        this.desTipo = desTipo;
    }
    private String desTipo;
    
}
