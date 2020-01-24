/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony Vaio
 */
public class sserie {

    private int num;
private String primos;

    public String getPrimos() {
        return primos;
    }

    public void setPrimos(String primos) {
        this.primos = primos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
   
 public sserie(){
     this.num = 0;
 }
   public int calcularSerie(){
       int base = 2;
       int resultado = 0;
       for (int i =1;i<=this.num; i++){
           resultado = resultado *base;
           
       }
       return 0;
       
   }
}
