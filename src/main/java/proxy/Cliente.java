package patterns.proxy;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public int id() {
        return id;
    }

    public void defineId(int id) {
        this.id = id;
    }
}
