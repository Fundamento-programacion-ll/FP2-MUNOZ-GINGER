/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class pais {
    private ArrayList<Provincia> listaProvincias ;

    public pais() {
        this.listaProvincias= new ArrayList<>();
    }

    public ArrayList<Provincia> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias() {
      int opcion ;
        Provincia provincia;
        do {            
            provincia = new Provincia();
            agregarProvincia(provincia);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION);        
    }
    
    public void agregarProvincia(Provincia p){
        this.listaProvincias.add(p);
    }

    public void ordenarPornombreprov(){
        Collections.sort(listaProvincias,new comparador());
                
                }
     public void ordenarPorNumero(){
        // ordenar la lista de objetos por el nombre
        Collections.sort(listaProvincias, new ComparadorHabitantes());
     }
    @Override
    public String toString() {
        return "p"+this.listaProvincias;
    }
    
    
}
