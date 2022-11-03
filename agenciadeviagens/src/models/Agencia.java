package models;

import java.util.ArrayList;

public class Agencia {
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Viagem> viagens = new ArrayList<>();
    public ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public void addViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void agendarViagem(Cliente cliente, Viagem viagem) {
        agendamentos.add(new Agendamento(cliente, viagem));
    }

    public void cancelarViagem(Agendamento agendamento) {
        agendamentos.remove(agendamento);
    }

    public void mostrarAgendamentos() {
        for(Agendamento tmp : agendamentos) {
            System.out.println("------------------------");
            System.out.println("Cliente: " + tmp.cliente);
            System.out.println("Viagem: " + tmp.viagem.lugar);
            System.out.println("Data: " + tmp.viagem.data);
        }
    }
}
