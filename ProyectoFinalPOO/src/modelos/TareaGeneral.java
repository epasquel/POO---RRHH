/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class TareaGeneral {

    private String responsable;
    private String tipo;
    private String fechaVencimiento;

    public TareaGeneral(String responsable, String tipo, String fechaVencimiento) {
        this.responsable = responsable;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
