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
public class Empleadomascomision extends EmpleadoComision{
    double salarioBase;

    public Empleadomascomision(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleadomascomision(double salarioBase, double ventasBrutas, double tarifaComision) {
        super(ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public Empleadomascomision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, int ci) {
        super(ventasBrutas, tarifaComision, nombre, apellido, ci);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    
    

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase<0?0:salarioBase;
    }

   
    public double ingresos(){
        return salarioBase* super.calcularIngresoso();
    }

    @Override
    public String toString() {
        return "Empleado base mas comision"+"Nombre"+getNombre()+"Apellido"+getApellido()+"CI"+getCi()+"Salario base y comision"+ingresos();
    }
    
}
