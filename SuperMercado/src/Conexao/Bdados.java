/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Bdados {
    public java.sql.Connection getConnection() {
        try {
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/gestaovenda","root", "");
                   
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bdados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
    
