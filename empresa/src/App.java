import models.Cargo;
import models.Empresa;
import models.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        //Cria o Objeto empresa
        Empresa empresa = new Empresa();

        //Add os funcionarios
        empresa.cadastraFuncionario(new Funcionario("João", "00000000000", 34, new Cargo("Faxineiro", 1200.00)));

        empresa.cadastraFuncionario(new Funcionario("Maria", "00000000001", 25, new Cargo("Secretario", 1500.00)));

        empresa.cadastraFuncionario(new Funcionario("Railane", "00000000002", 21, new Cargo("CEO", 12000.00)));

        empresa.cadastraFuncionario(new Funcionario("Eduardo", "00000000003", 34, new Cargo("Assessor de Marketing", 3300.00)));

        empresa.cadastraFuncionario(new Funcionario("Allexandre", "00000000004", 34, new Cargo("Programador", 20000.00)));

        //Método para mostrar todos os funcionários da empresa
        empresa.mostraFuncionarios();
    }
}
