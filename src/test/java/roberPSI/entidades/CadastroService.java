package roberPSI.entidades;

public class CadastroService {
     public static void criar(Cadastro cadastro) {
        CadastroDAO cadastroDAO = new CadastroDAO();
        cadastroDAO.create(cadastro);
    }
}
