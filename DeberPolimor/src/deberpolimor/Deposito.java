/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimor;

/**
 *
 * @author Sony Vaio
 */
public class Deposito extends Transaccion {
    private double mondepo;

    public double getMondepo() {
        return mondepo;
    }

    public void setMondepo(double mondepo) {
        this.mondepo = mondepo;
    }

    public Deposito(double mondepo) {
        this.mondepo = mondepo;
    }

    public Deposito(double mondepo, int cuenta) {
        super(cuenta);
        this.mondepo = mondepo;
    }

    public Deposito() {
    }

    @Override
    public String ejecutar() {
          return "Su número de Cuenta es: "+getCuenta()+" su monto depositado es de: "+getMondepo();
    }

    @Override
    public String toString() {
         return "Su Número de cuenta es: "+getCuenta()+" su monto depositado es de: "+getMondepo();
    }
    
}
