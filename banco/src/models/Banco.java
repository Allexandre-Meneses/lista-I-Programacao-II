import java.util.ArrayList;

public class Banco {
    public ArrayList<Cliente> clientes = new ArrayList<>();

    public void addClienteBanco(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraContas() {
        for(Cliente tmp : clientes) {
            System.out.println("----------------");
            System.out.println(tmp.nome);
            System.out.println("Número da Conta: " + tmp.conta.nConta);
            System.out.println("Saldo: " + tmp.conta.saldo);
        }
    }
}
