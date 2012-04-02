/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import controladoras.AdmRol;


public class Usuario {
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;
    private String usuario;
    private String correo;
    private String fechaIngreso;
    private String cargo;
    private Rol rol;
    private String password;
    private String descripcionRol;

    public Usuario(String dni, String nombre, String paterno, String materno, String usuario, String correo, String fechaIngreso, String cargo, String nombreRol, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.usuario = usuario;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;        
        this.rol = new Rol(nombreRol, descripcionRol);
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getPaterno() {
        return paterno;
    }

    public Rol getRol() {
        return rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }
    
}
