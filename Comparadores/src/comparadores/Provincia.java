/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class Provincia {
    private String nombreProvincia;
    private int numeroHabitantes;

    public Provincia() {
          String datos= JOptionPane.showInputDialog(null, "Ingrese los datos separados por coma");
        StringTokenizer tokens= new StringTokenizer(datos,",");
        
        this.nombreProvincia= (tokens.nextToken());
        this.numeroHabitantes = Integer.parseInt(tokens.nextToken());
    }

    public Provincia(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "Nombre: "+ getNombreProvincia()+" habitantes: "+getNumeroHabitantes();
    }
    
}
