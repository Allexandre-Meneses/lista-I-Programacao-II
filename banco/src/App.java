
public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Banco
        Banco banco = new Banco();

        //Add Clientes ao Banco e Contas aos Clientes
        banco.addClienteBanco(new Cliente("João", "00000000912", new Conta("124", "Corrente", 200.00)));

        banco.addClienteBanco(new Cliente("Francisco", "00000000812", new Conta("224", "Corrente", 2000.00)));

        banco.addClienteBanco(new Cliente("Victor", "00000020912", new Conta("334", "Corrente", 120.00)));

        //Método sacar()
        banco.clientes.get(0).conta.sacar(50.00);

        //Método depositar()
        banco.clientes.get(1).conta.depositar(50.00);

        //Método para mostrar clientes e contas do banco
        banco.mostraContas();
    }
}
