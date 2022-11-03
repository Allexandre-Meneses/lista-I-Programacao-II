import java.util.ArrayList;

public class Arena {
    public ArrayList<Esporte> esportes = new ArrayList<>();
    public ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public void cadastraEsportes(Esporte esporte) {
        this.esportes.add(esporte);
    }

    public void cadastraClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void marcarHorario(Agendamento agendamento) {
        this.agendamentos.add(agendamento);
    }

    public void mostrarAgendamentos() {
        for(Agendamento tmp : agendamentos) {
            System.out.println("------------------------------");
            System.out.println("Cliente: " + tmp.cliente.nome);
            System.out.println("Esporte: " + tmp.esporte.nome);
            System.out.println("Data:  " + tmp.data);
            System.out.println("Hora: " + tmp.hora);
        }

    }
}
