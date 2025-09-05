package proxy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientePg implements Persistencia{
    private DataSource dataSource;

    public ClientePg(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        String sql = "insert into (nome) values (?)";
        try  (Connection connection = dataSource.getConnection();
              PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, cliente.nome());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("erro ao submeter a instrucao sql", e);
        }
    }

    @Override
    public Cliente buscarClientePorId(int id) {
        String sql = "select id, nome from cliente where id = ?";
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)){
             stmt.setInt(1, id);
             try(
                 ResultSet rs = stmt.executeQuery()){
                 if (rs.next()){
                     Cliente cliente = new Cliente(rs.getString("nome"), id);
                     return cliente;
                 } return null;
             }
        } catch (SQLException e) {
            throw new RuntimeException("erro ao localizar cliente por id");
        }

    }
}
