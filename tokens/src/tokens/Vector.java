/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class Vector {
     private int vector [];

    public int[] getVector() {
        return vector;
    }

    public void setVector( ) {
        
      String datosVector;
        datosVector=JOptionPane.showInputDialog(null,"Ingrese los valores separados por coma");
        StringTokenizer tokkens= new StringTokenizer(datosVector,",");
        
        for (int i =0; i<this.vector.length&&tokkens.hasMoreTokens();
                i++){
            this.vector[i]=Integer.parseInt(tokkens.nextToken());
    }
    }
    
    public Vector() {
    }
    

    public Vector(int[] vector) {
        super();
        this.vector = vector;
       
        }
    public Vector(int dimension){
        
        super();
        this.vector=new int[dimension];
        this.setVector();
    }

    @Override
    public String toString() {
        return "Vector:"+Arrays.toString(vector);
    }
     
         
     
}
