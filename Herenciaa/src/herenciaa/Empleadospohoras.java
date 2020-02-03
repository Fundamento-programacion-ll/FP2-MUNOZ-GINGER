/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaa;

/**
 *
 * @author Sony Vaio
 */
public class Empleadospohoras  extends Empleado{
    double Sueldo;
    double horas;

    public Empleadospohoras() {
    }

    public Empleadospohoras(double Sueldo, double horas) {
        this.Sueldo = Sueldo;
        this.horas = horas;
    }

    public Empleadospohoras(double Sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.Sueldo = Sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo<0?0:Sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = (horas> 0 && horas<= 168) ? horas:0;
    }

    @Override
    public Double calcularIngresoso() {
        return horas*Sueldo;
    }

    @Override
    public String toString() {
        return "Empleadospohoras" +"Nombre"+getNombre()+"Apellido"+getApellido()+"CI"+getCi()+ "Sueldo" + Sueldo + " horas=" + horas + "Salario por horas"+calcularIngresoso();
    }

  
    
}
