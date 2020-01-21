/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sony Vaio
 */
public class persona {
     String nombre ;
     String apellidos;
     String cedula;
     int edad;
     String telefono ;
     String direccion;
     char genero;
     boolean estadocivil;

    public persona(String nombre, String apellidos, String cedula, int edad, String telefono, String direccion, char genero, boolean estadocivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.estadocivil = estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(boolean estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "nombre:"+ this.getNombre();
    }
     
     
             
}
