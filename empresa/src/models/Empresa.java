package models;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastraFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void mostraFuncionarios() {
        for(Funcionario tmp : this.funcionarios) {
            System.out.println("--------------------------");
            System.out.println(tmp.nome);
            System.out.println("CPF: " + tmp.cpf);
            System.out.println(tmp.idade + "anos");
            System.out.println("Cargo: " + tmp.cargo.nome);
            System.out.println("Salário: " + tmp.cargo.salario);
        }
    }
}
