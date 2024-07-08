package collections.map.ordenacao;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println(
                    "Data: " + dataEvento + ", Evento: " + evento.getNomeEvento() + ", Atração: "
                            + evento.getNomeAtracao());
        }
    }
    
    public void obterProximoEvento() {
        Evento eventoProximo = null;
        LocalDate dia = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : agendaMap.entrySet()) {
            LocalDate diaEvento = entry.getKey();
            if (diaEvento.isEqual(dia) || diaEvento.isAfter(dia)) {
                dia = diaEvento;
                eventoProximo = entry.getValue();
                break;
            }
        }
        System.out.println("O próximo evento: " + eventoProximo.getNomeEvento() + " acontecerá na data " + dia);
    }

    public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    // Adiciona eventos à agenda
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
    agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 28), "Hackathon de Inovação", "Competição de soluções criativas");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 20), "Conferência de Tecnologia", "Palestrante renomado");

    // Exibe a agenda completa de eventos
    agendaEventos.exibirAgenda();

    // Obtém e exibe o próximo evento na agenda
    agendaEventos.obterProximoEvento();
  }

}
