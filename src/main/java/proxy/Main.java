package patterns.proxy;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerNames(new String[]{"localhost"});
        ds.setPortNumbers(new int[]{5432});
        ds.setDatabaseName("clientes_proxy");
        ds.setUser("postgres");
        ds.setPassword("ifsc");

        Cliente cliente = new Cliente("Ana");

        /*Persistencia persistencia = new ClientePg(ds);
        Persistencia clientePgProxy = new ClientePgProxy(persistencia);

        Persistencia log = new Log(clientePgProxy);*/

        Log log = new Log(new ClientePgProxy(new ClientePg(ds)));

        log.inserirCliente(cliente);
        log.buscarClientePorId(1);

    }
}
