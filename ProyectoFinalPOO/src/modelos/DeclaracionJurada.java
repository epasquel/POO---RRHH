
package modelos;

import java.util.Date;


public class DeclaracionJurada {
    
    public DeclaracionJurada(Responsable responsable, Tipo tipo, String fechaVencimiento){
            
        this.responsable = responsable;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    private Responsable responsable;
    private Tipo tipo;
    private String fechaVencimiento;

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
    
}
