/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoEnClase;


public class docente extends persona{
    
    private String area,cargo;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public docente(String area, String cargo, String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        super(nombre, apellido, genero, edad, ci, sueldo);
        this.area = area;
        this.cargo = cargo;
    }

    public docente() {
    }
    
    @Override
    public int calcularsueldo() {
        return getSueldo();
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
}
