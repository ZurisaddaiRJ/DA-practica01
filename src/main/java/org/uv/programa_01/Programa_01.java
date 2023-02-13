/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.uv.programa_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//TOKEN
//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
/**
 *
 * @author zuley
 */
public class Programa_01 {

    public static void main(String[] args) {
        Connection con = null;
        Statement st=null;
        try {
            String sql = " insert into empleados (clave, nombre, direccion, telefono) values "
                    + " ('01, 'Zuri', 'av 1', '555')";
            String url = "jdbc:postgresql://localhost:7000/ejemplo3";
            String pwd = "postgres";
            String user = "postgres";
            con = DriverManager.getConnection(url, user, pwd);
            Logger.getLogger(Programa_01.class.getName()).log(Level.INFO, "Se conectó la BD...");
            st = con.createStatement();
            st.execute(sql);
            Logger.getLogger(Programa_01.class.getName()).log(Level.INFO, "Se Guardo...");

        } catch (SQLException ex) {
            Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st!= null) 
                    st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (con != null)
                 
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }
