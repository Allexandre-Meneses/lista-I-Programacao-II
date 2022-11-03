package models;

public class Aluguel {
    Cliente cliente;
    Veiculo veiculo;
    String data;
    
    public Aluguel(Cliente cliente, Veiculo veiculo, String data) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data = data;
    }

}
