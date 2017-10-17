/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leilao;

/**
 *
 * @author Luana
 */
import java.sql.*;

/**
 *
 * @author Luana
 */
public class Conexao {

    public static Connection abrirConexao() {
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String senha = "admin";
        String url = "jdbc:postgresql://127.0.0.1:5433/OrbitaObvia";

        Connection con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, senha);
            System.out.println("Conexao realizada com sucesso ");
        } catch (ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        return con;
    }

    public static void fecharConexao (Connection con) throws SQLException  {
        
            con.close();
        

    }
}
