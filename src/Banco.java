import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void exibirLista() {
        //substitui o sout padrão para exibir a lista de maneira legivel no terminal.
        contas.stream()
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}
