package modelos;

import controladoras.AdmRol;


public class Usuario {
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String usuario;
    private String correo;
    private String fechaIngreso;
    private String cargo;
    private Rol rol;
    private String password;
    private String descripcionRol;

    public Usuario(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String usuario, String correo, String fechaIngreso, String cargo, String nombreRol, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.rol = new Rol(nombreRol, descripcionRol);
        this.password = password;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public Rol getRol() {
        return rol;
    }

    public String getUsuario() {
        return usuario;
    } 
}
