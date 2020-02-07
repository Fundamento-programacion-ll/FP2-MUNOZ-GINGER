/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author Sony Vaio
 */
public class Comparadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String salida="";
     pais p = new pais();
     p.getListaProvincias();
     salida +="Lista Provincia:"+p.toString();
        System.out.println(salida);
        
            p.ordenarPornombreprov();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
         p.ordenarPorNumero();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
    }
    
}
