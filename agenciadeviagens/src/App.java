import models.Agencia;
import models.Cliente;
import models.Viagem;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia Agencia
        Agencia agencia = new Agencia();

        //Add os Clientes à agência
        agencia.addCliente(new Cliente("João", "12345678932"));
        agencia.addCliente(new Cliente("José", "12345678322"));
        agencia.addCliente(new Cliente("Maria", "32145678932"));

        //Add Pacote de Viagens à agência
        agencia.addViagem(new Viagem("Canidé","25-11-2022"));
        agencia.addViagem(new Viagem("Sítio do Bosco","30-11-2022"));
        agencia.addViagem(new Viagem("Praia do Coqueiro","04-12-2022"));

        //Método para agendar Viagens
        agencia.agendarViagem(agencia.clientes.get(0), agencia.viagens.get(0));
        agencia.agendarViagem(agencia.clientes.get(1), agencia.viagens.get(2));
        agencia.agendarViagem(agencia.clientes.get(2), agencia.viagens.get(1));

        //Método para cancelar Viagens
        agencia.cancelarViagem(agencia.agendamentos.get(0));

        //Método para mostrar todas as Viagens agendadas
        agencia.mostrarAgendamentos();
    }
}
