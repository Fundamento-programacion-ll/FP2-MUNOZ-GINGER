/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoEnClase;

import javax.swing.JOptionPane;


public class TrabajoEnClase {

   
    public static void main(String[] args) {
        lista_persona l = new lista_persona();
        String salida="";
        l.setListapersonas();
        salida = "Lista Personas: \n"+l.toString();
        System.out.println(salida);
        
        l.ordenarPorNombreProvincia();
        salida = "Lista Personas por Nombre: \n"+l.toString();
        System.out.println(salida);
        
        l.ordenarPorNumero();        
        salida = "Lista Personas por Sueldo: \n"+l.toString();
        System.out.println(salida);
        
    }   
}