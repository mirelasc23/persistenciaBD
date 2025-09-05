package patterns.proxy;

public class Log implements Persistencia{
    private Persistencia persistencia;

    public Log(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        this.persistencia.inserirCliente(cliente);
        System.out.println("inserindo pelo cache");

    }

    @Override
    public Cliente buscarClientePorId(int id) {
        System.out.println("buscando pelo cache");
        return this.persistencia.buscarClientePorId(id);
    }
}
