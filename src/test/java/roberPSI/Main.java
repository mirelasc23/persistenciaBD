package roberPSI;

import roberPSI.entidades.Cadastro;
import roberPSI.entidades.CadastroService;
import roberPSI.util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println("Novo Cadastro");
        
        System.out.println("Informe o id:");
        int id = Util.lerInt();
        System.out.println("Informe o nome:");
        String nome = Util.lerString();
        System.out.println("Informe o cpf:");
        String cpf = Util.lerString();
        
        Cadastro cadastro = new Cadastro(id, nome, cpf);
        CadastroService.criar(cadastro);
        
        System.out.println(cadastro);
    }
}
