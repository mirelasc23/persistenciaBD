package patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class ClientePgProxy implements Persistencia{
    private Map<Integer, Cliente> cache;
    private Persistencia persistencia;

    public ClientePgProxy(Persistencia persistencia) {
        this.persistencia = persistencia;
        this.cache = new HashMap<>();
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        this.persistencia.inserirCliente(cliente);
        this.cache.put(cliente.id(), cliente);
    }

    @Override
    public Cliente buscarClientePorId(int id) {
        Cliente cliente = cache.get(id);

        if (cliente != null) {
            return cliente;
        }

        cliente = this.persistencia.buscarClientePorId(id);

        if (cliente != null){
            cache.put(id, cliente);
            return cliente;
        }

        return new Cliente("Cliente não localizado", id);
    }
}
