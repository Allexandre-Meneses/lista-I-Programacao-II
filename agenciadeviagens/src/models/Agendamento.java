package models;

public class Agendamento {
    Cliente cliente;
    Viagem viagem;
    
    public Agendamento(Cliente cliente, Viagem viagem) {
        this.cliente = cliente;
        this.viagem = viagem;
    }
}
