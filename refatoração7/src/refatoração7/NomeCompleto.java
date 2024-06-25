package refatoração7;
import javax.swing.JOptionPane;

public class NomeCompleto {
    
    public static void main(String[] args) {
        String primeiroNome = lerNome("Informe o primeiro nome:");
        String nomeDoMeio = lerNome("Informe o nome do meio:");
        String ultimoNome = lerNome("Informe o último nome:");

        String nomeCompleto = construirNomeCompleto(primeiroNome, nomeDoMeio, ultimoNome);
        exibirMensagem("Nome completo: " + nomeCompleto);
    }

    private static String lerNome(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    private static String construirNomeCompleto(String primeiroNome, String nomeDoMeio, String ultimoNome) {
        return primeiroNome + " " + nomeDoMeio + " " + ultimoNome;
    }

    private static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

