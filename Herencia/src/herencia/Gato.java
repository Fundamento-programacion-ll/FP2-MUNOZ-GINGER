/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Sony Vaio
 */
public class Gato extends Animal {
  String  colorOjos;  

    public Gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Gato(String colorOjos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
  public void datosGatos(){
      System.out.println("");
  }
}
