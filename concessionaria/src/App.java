import models.Cliente;
import models.Concessionaria;
import models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia o Objeto concessioinária
        Concessionaria concessionaria = new Concessionaria();
        
        //Add Veiculos a Concessionária
        concessionaria.addVeiculo(new Veiculo("Fiat 147", "X0X-1234", "Amarelo", 3000.00));

        concessionaria.addVeiculo(new Veiculo("BMW M2", "X1X-1235", "Azul", 500.00));
        
        concessionaria.addVeiculo(new Veiculo("Renault Logan", "X2X-1335", "Prata", 200.00));

        //Add Clientes a Concessionária
        concessionaria.addCliente(new Cliente("João", "00000000000"));

        concessionaria.addCliente(new Cliente("Matheus", "00000000010"));

        concessionaria.addCliente(new Cliente("Aldemir", "000000000300"));

        //Método para alugar um veículo
        concessionaria.alugarVeiculo(concessionaria.clientes.get(0), concessionaria.veiculos.get(0), "02-06-2022");

        concessionaria.alugarVeiculo(concessionaria.clientes.get(1), concessionaria.veiculos.get(2), "03-06-2022");

        concessionaria.alugarVeiculo(concessionaria.clientes.get(2), concessionaria.veiculos.get(1), "02-06-2022");

        //Método para mostrar todos os alugueis
        concessionaria.mostrarAlugueis();
    }
}
