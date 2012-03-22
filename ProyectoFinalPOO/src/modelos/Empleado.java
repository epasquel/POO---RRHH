
package modelos;


public class Empleado extends Usuario{
    private String codigoEmpleado;

    public Empleado(String codigoEmpleado,String dni, String nombre, String apellido_Paterno,String apellidoMaterno,String email,String fecha_Ingreso, String userName, String password) {
        super(nombre, apellido_Paterno, userName, password);
        
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
}
