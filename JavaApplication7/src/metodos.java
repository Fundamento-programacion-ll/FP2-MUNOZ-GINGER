
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony Vaio
 */
public class metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sserie instanciaSerie = new sserie();
         int numeroIngresado = 0;
        // TODO code application logic here
        Scanner numeroUno= new Scanner(System.in);
        System.out.println("Ingre un numero");
        numeroIngresado = numeroUno.nextInt();
        instanciaSerie.calcularSerie();
        System.err.println("RESULTADO:"+instanciaSerie);
        
    }
    
}
