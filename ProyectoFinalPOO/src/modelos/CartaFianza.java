
package modelos;

import java.util.ArrayList;
/*import java.util.Calendar;*/


public class CartaFianza extends Documento{

    private String numDocumento;
    private String tipo;
    private String numContrato;
    private String bancoEmisor;
    private String proveedor;
    private String numProcesoSel;
    private double importe;
    
    
    /*public CartaFianza(Calendar fechaven, String responsable)*/
    public CartaFianza(String fechaven, String responsable) {
        super(fechaven, responsable);
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNumProcesoSel() {
        return numProcesoSel;
    }

    public void setNumProcesoSel(String numProcesoSel) {
        this.numProcesoSel = numProcesoSel;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    
}
