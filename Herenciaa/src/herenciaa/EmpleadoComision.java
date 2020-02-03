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
public class EmpleadoComision extends Empleado {
    double ventasBrutas;
    double tarifaComision;

    public EmpleadoComision() {
    }

    public EmpleadoComision(double ventasBrutas, double tarifaComision) {
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public EmpleadoComision(double ventasBrutas, double tarifaComision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public Double calcularIngresoso() {
        return ventasBrutas*tarifaComision;
    }

    @Override
    public String toString() {
        return "EmpleadoComision"+"Nombre"+getNombre()+"Apellido"+getApellido()+"CI"+getCi()+ "ventasBrutas"+ventasBrutas+ "tarifaComision"+tarifaComision+"Salario por comision"+calcularIngresoso();
    }

    
}
