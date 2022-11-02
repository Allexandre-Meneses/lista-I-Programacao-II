package models;

public class Funcionario {
    String nome;
    String cpf;
    int idade;   
    Cargo cargo; 

    public Funcionario(String nome, String cpf, int idade, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cargo = cargo;
    }
}
