package testeBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static void main(String[] args) {
        // Substitua pelos seus dados
        String url = "jdbc:postgresql://localhost:5432/revisao_avaliacao02"; // URL do banco
        String usuario = "postgres"; // Nome de usuário
        String senha = "ifsc"; // Senha

        try {
            // 1. Carregar o driver (opcional em versões modernas do JDBC 4.0+)
            // Class.forName("org.postgresql.Driver");

            // 2. Obter a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com o banco de dados PostgreSQL estabelecida com sucesso!");

            // Aqui você pode adicionar seus comandos SQL

            // 3. Fechar a conexão (sempre importante)
            conexao.close();
            System.out.println("Conexão fechada.");

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


/*
https://www.google.com/search?q=como+conectar+ao+banco+de+dados+postgresql+co+java&oq=como+conectar+ao+banco+de+dados+postgresql+co+java&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIJCAEQIRgKGKABMgkIAhAhGAoYoAEyCQgDECEYChigATIJCAQQIRgKGKAB0gEJMTM5MjJqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8&zx=1757819225325&no_sw_cr=1

*/