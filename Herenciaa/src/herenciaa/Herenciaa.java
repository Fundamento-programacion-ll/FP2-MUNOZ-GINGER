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
public class Herenciaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado p = new EmpleadoAsalariado(100, "Ginger", "dddd", 1555);
        System.out.println(p);
        Empleadomascomision ep = new Empleadomascomision(123, 1234, 1445, "Ginger", "Muñoz", 1234);
        System.out.println(ep);
        EmpleadoComision g = new EmpleadoComision(1234, 144, "Ginger", "Muñoz", 1234);
        System.out.println(g);
        Empleadospohoras pe = new Empleadospohoras(1234, 1445, "Ginger", "Muñoz", 1234);
        System.out.println(pe);
    }
    
}
