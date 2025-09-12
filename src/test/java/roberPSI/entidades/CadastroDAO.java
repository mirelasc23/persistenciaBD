package roberPSI.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {
    public void create(Cadastro cadastro) {
        
        String sqlInstrucao = "insert into cadastro (nome, cpf)"
                + " values(?, ?)";
   
        Connection conexao = ConnectionFactory.getConnection();    
        PreparedStatement pstm = null;
        
        try {        
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(1, cadastro.nome());
            pstm.setString(2, cadastro.cpf());
            
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactory.closeConnecition(conexao, pstm);
        }
    }
}
