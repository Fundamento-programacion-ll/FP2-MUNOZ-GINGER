/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class Tokens {
 public static void main(String[]args){
    int dimension=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la dimension del arreglo"));
    Vector vec = new Vector(dimension);
     System.out.println(vec);
 }
   
   
    
    
}
