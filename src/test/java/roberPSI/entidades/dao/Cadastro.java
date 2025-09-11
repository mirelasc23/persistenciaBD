package roberPSI.entidades.dao;

public class Cadastro {
    private int id;
    private String nome, cpf;

    public Cadastro(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int id() {
        return id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String cpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nCód. " + id + ": \n" + nome + " - " + cpf + ";";
    }
    
    
    
}
