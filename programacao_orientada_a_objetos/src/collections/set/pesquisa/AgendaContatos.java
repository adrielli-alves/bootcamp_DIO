package collections.set.pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!agendaContatos.isEmpty()) {
            System.out.println(agendaContatos);
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public void pesquisarPorNome(String nome) {
        Set<Contato> buscaDeContatos = new HashSet<>();
        for (Contato c : agendaContatos) {
            if (c.getNome().startsWith(nome)) {
                buscaDeContatos.add(c);
            }
        }
        System.out.println(buscaDeContatos);
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public Contato atualizarNomeContato(String novoNome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatos) {
            if (c.getNumero() == numero) {
                c.setNome(novoNome);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("David", 1000);
        agendaContatos.adicionarContato("Elaine", 2000);
        agendaContatos.adicionarContato("Felix", 3000);
        agendaContatos.adicionarContato("Augusto", 4000);
        agendaContatos.adicionarContato("David Alves", 5000);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("David");

        System.out.println("Contato atualizado:" + agendaContatos.atualizarNumeroContato("Elaine", 2222));
        System.out.println("Contato atualizado:" + agendaContatos.atualizarNomeContato("David Jesus", 5000));

        agendaContatos.exibirContatos();

    }

}
