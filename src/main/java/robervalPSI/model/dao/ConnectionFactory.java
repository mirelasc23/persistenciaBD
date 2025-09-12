package robervalPSI.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    public static final String driver = "org.postgresql.Driver";
    public static final String banco = "jdbc:postgresql://localhost:5432/hotel";
    public static final String usuario = "root";
    public static final String senha = "ifsc";
    
    public static Connection getConnection(){
        try {
            //Class.forName(driver);
            return DriverManager.getConnection(banco, usuario, senha);
        } catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    
    public static  void closeConnecition(Connection conexao){
        try {
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static  void closeConnecition(Connection conexao, PreparedStatement psmt){
        try {
            psmt.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static  void closeConnecition(Connection conexao, PreparedStatement psmt, ResultSet rst){
        try {
            psmt.close();
            rst.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

