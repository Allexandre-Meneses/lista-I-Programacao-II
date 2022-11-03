public class Conta {
    String nConta;
    String tConta;
    double saldo;
    
    public Conta(String nConta, String tConta, double saldo) {
        this.nConta = nConta;
        this.tConta = tConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

}
