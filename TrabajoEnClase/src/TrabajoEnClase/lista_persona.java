/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoEnClase;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class lista_persona {
    
    private ArrayList <persona> listapersonas;

    public lista_persona() {
        this.listapersonas = new ArrayList<>();
    }

    public lista_persona(ArrayList<persona> listaperson) {
        this.listapersonas = listaperson;
    }

    public ArrayList<persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas() {
    int opcion=0 ;
        persona per;
        do {            
            per = new persona();
            agregarProvincia(per);
            opcion = JOptionPane.showConfirmDialog(null, "Desea agregar mas personas");
        } while (opcion==0);
        
    }
    
    
    public void agregarProvincia(persona provincia){
        this.listapersonas.add(provincia);
    }
    
    
    public void ordenarPorNombreProvincia(){
        
        Collections.sort(listapersonas, new Comparadorsueldo());
    }
    
    
    public void ordenarPorNumero(){
    
        Collections.sort(listapersonas, new comparadornombre());
    }
    

    @Override
    public String toString() {
        return "\n"+this.listapersonas;
    }

}
