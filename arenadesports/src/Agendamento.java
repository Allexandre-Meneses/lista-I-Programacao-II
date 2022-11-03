public class Agendamento {
    Cliente cliente;
    Esporte esporte;
    String data;
    String hora;
    
    public Agendamento(Cliente cliente, Esporte esporte, String data, String hora) {
        this.cliente = cliente;
        this.esporte = esporte;
        this.data = data;
        this.hora = hora;
    }
}
