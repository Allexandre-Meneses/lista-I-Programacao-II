package models;

import java.util.ArrayList;

public class Concessionaria {
    public ArrayList<Veiculo> veiculos = new ArrayList<>();
    public ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Aluguel> alugueis = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void alugarVeiculo(Cliente cliente, Veiculo veiculo, String data) {
        alugueis.add(new Aluguel(cliente, veiculo, data));
    }

    public void mostrarAlugueis() {
        for(Aluguel tmp : alugueis) {
            System.out.println("--------------------");
            System.out.println("Cliente: " + tmp.cliente.nome);
            System.out.println("Veiculo: " + tmp.veiculo.modelo + " de placa: " + tmp.veiculo.placa);
            System.out.println("Na data: " + tmp.data);
        }
    }
}
