import models.Agendamento;
import models.Arena;
import models.Cliente;
import models.Esporte;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Arena
        Arena arena = new Arena();

        //Método para cadastrar Esportes
        arena.cadastraEsportes(new Esporte("Futsal"));
        arena.cadastraEsportes(new Esporte("Futebol"));
        arena.cadastraEsportes(new Esporte("Vôlei"));
        arena.cadastraEsportes(new Esporte("Beach Tênis"));

        //Método para cadastrar Clientes
        arena.cadastraClientes(new Cliente("Allexandre", "00000012982"));
        arena.cadastraClientes(new Cliente("Railane", "00300012982"));
        arena.cadastraClientes(new Cliente("Alenildo", "00034012982"));

        //Método marcarHorario()
        arena.marcarHorario(new Agendamento(arena.clientes.get(0), arena.esportes.get(1), "03-11-2022", "20:00"));
        arena.marcarHorario(new Agendamento(arena.clientes.get(1), arena.esportes.get(0), "03-11-2022", "20:00"));
        arena.marcarHorario(new Agendamento(arena.clientes.get(2), arena.esportes.get(3), "03-11-2022", "18:00"));

        //Método para mostrar todos os agendamentos
        arena.mostrarAgendamentos();
    }
}
