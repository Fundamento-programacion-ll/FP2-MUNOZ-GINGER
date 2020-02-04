/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimor;

import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class DeberPolimor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
      /* Solicitud_saldo s=new Solicitud_saldo(150, 1752302230);
      System.out.println(s);
      
      Deposito d=new  Deposito(800, 1752302230);
      System.out.println(d);
      
      Retiros r=new Retiros(200, 1752302230);
      System.out.println(r);
      Stotal= s.getValor()+d.getMondepo()-r.getMonto();
      System.out.println("El saldo total que tiene es de: "+Stotal);*/
        
        
       int cuenta[] = new int [3];
       
       cuenta[0]=1500;
       cuenta[1]=1000;
       cuenta[2]=2000;

       String usuario[]= new String[3];
       usuario[0]="Uusuario 1";
       usuario[1]="Uusuario 2";
       usuario[2]="Uusuario 3";
       double saldo []= new double[3];
       saldo[0]=90;
       saldo[1]=50;
       saldo[2]=60;
      String  s=JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
      String g=JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
      boolean c =false;  
        
      
      for (int i=0; i <cuenta.length; i++){
          if(usuario [1].equals(s) && cuenta[1]==Integer.parseInt(g)){
              int a =i;
              
         String sp= JOptionPane.showInputDialog(null,"Ingrese una opcion\n 1.Consulta de saldo\n2.Retiro\n3.Deposito");
         
         switch (sp){
             case "1":
                 Solicitud_saldo ns= new Solicitud_saldo(saldo[a],Integer.parseInt(g));
                 JOptionPane.showMessageDialog(null, "Nombre de usuario:"+s+" "+ns.ejecutar());
                 break;
             case "2":
               String r =JOptionPane.showInputDialog(null,"Ingrese el retiro");
               Retiros e = new Retiros(Double.parseDouble(r),Integer.parseInt(g));
               JOptionPane.showMessageDialog(null, "Nombre de usuario:"+s+""+e.ejecutar());
               break;
             case "3":
                String d =JOptionPane.showInputDialog(null,"Ingrese el retiro"); 
                Deposito de= new Deposito(Double.parseDouble(d),Integer.parseInt(g));
                JOptionPane.showMessageDialog(null, "Nombre de usuario:"+s+""+de.ejecutar());
             default:
                 JOptionPane.showMessageDialog(null,"IIngrese una opcion correcta");
                 break;
             
         }
         
              
          }
      }
      if (c==false){
          JOptionPane.showMessageDialog(null, "Usuario y cuenta inexistentes");
      }
      
    
    }
    
}
