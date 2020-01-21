/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import modelo.persona;
import vista.usuario;

/**
 *
 * @author Sony Vaio
 */
public class MVC {
    public static void main(String[]args){
        usuario inicio = new usuario();
      persona g = new persona("Ginger", "Muñoz", "12344", 19, "16688", "pintado", 'f', true);
      persona a = new persona("Ginger", "Muñoz", "12345", 19, "1345", "pintado", 'f', true);
      persona s = new persona("Ginger", "Muñoz", "12345", 19, "123345", "pintado", 'f', true);
     inicio.menu();
    }
}
