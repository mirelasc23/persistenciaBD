package patterns.proxy;

public interface Persistencia {
    void inserirCliente(Cliente cliente);
    Cliente buscarClientePorId(int id);
}
