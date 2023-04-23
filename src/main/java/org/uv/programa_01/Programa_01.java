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
        Statement st = null;
        try {
            String url = "jdbc:postgresql://localhost:7000/ejemplo3";
            String user = "postgres";
            String pwd = "postgres";
            String sql = "INSERT INTO empleados(clave,nombre,direccion,telefono) "
                    + "VALUES ('02','Zuri','Avenida 7','2711107778');";

            con = DriverManager.getConnection(url, user, pwd);
            Logger.getLogger(Programa_01.class.getName()).log(Level.INFO, "Se conecto...");

            st = con.createStatement();
            boolean res = st.execute(sql);

            if (!res) {
                Logger.getLogger(Programa_01.class.getName()).log(Level.INFO, "Se guardo...");
            } else {
                Logger.getLogger(Programa_01.class.getName()).log(Level.INFO, "No se guardo...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) 
                    try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa_01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
