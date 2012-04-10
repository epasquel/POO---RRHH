
package modelos;

public class Empleado extends Usuario{
    
    private String codigoEmpleado;

    public Empleado(String codigoEmpleado,String dni, String nombre, String apellidoPaterno,String apellidoMaterno,String usuario, String correo,String fechaIngreso, String cargo, Rol rol, String password) {
            super(dni, nombre, apellidoPaterno, apellidoMaterno, usuario, correo, fechaIngreso, cargo, rol, password);
        
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
}