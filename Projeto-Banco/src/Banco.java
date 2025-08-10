import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimirContas() {
        System.out.println("=== Contas do Banco: " + nome + " ===");
        for (Conta c : contas) {
            c.imprimirExtrato();
            System.out.println();
        }
    }
}
