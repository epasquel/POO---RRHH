
package modelos;

import java.util.ArrayList;
/*import java.util.Calendar;*/


public class CartaFianza {

    public CartaFianza(String numDocumento, Proveedor proveedor){
        this.numDocumento = numDocumento;
        this.proveedor = proveedor;
        this.importe = 0.00;
    }
    
    private String numDocumento;
    private String tipo;
    private String numContrato;
    private Banco bancoEmisor;
    private Proveedor proveedor;
    private String numProcesoSel;
    private double importe;
    
    protected Responsable responsable;
    protected String comentario;
    protected ArrayList<Usuario> listUsuario;
    protected String fechaCreacion;
    protected String usuCreacion;
    protected String fecActualizacion;
    protected String usuActualizacion;
    
    protected String fechaven;

    public String getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(String fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaven() {
        return fechaven;
    }

    public void setFechaven(String fechaven) {
        this.fechaven = fechaven;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getUsuActualizacion() {
        return usuActualizacion;
    }

    public void setUsuActualizacion(String usuActualizacion) {
        this.usuActualizacion = usuActualizacion;
    }

    public String getUsuCreacion() {
        return usuCreacion;
    }

    public void setUsuCreacion(String usuCreacion) {
        this.usuCreacion = usuCreacion;
    }      

    public Banco getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(Banco bancoEmisor) {
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
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
