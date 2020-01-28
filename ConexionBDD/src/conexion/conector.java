/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Sony Vaio
 */
public class conector {
    Connection conexion = null;
    String url="jbdc:mysql://localhost:";
    String usuario="admin";
    String passaword="1234";
    
    public conector(){
        
    }
}
