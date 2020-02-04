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
public class DeberPolimor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double Stotal;
        
        Solicitud_saldo s=new Solicitud_saldo(150, 1752302230);
        System.out.println(s);
        
        Deposito d=new  Deposito(800, 1752302230);
        System.out.println(d);
        
        Retiros r=new Retiros(200, 1752302230);
        System.out.println(r);
        Stotal= s.getValor()+d.getMondepo()-r.getMonto();
        System.out.println("El saldo total que tiene es de: "+Stotal);
        
           
       
    
    }
    
}
