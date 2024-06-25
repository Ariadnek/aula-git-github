package refatoração7;
import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
        int numero1 = lerNumero("Informe o primeiro número:");
        int numero2 = lerNumero("Informe o segundo número:");

        int operacao = lerOperacao();

        double resultado = realizarOperacao(numero1, numero2, operacao);

        exibirResultado(resultado, operacao);
    }

    private static int lerNumero(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
    }

    private static int lerOperacao() {
        String menu = "Escolha a operação:\n" +
                      "1 - Somar\n" +
                      "2 - Subtrair\n" +
                      "3 - Multiplicar\n" +
                      "4 - Dividir";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static double realizarOperacao(int numero1, int numero2, int operacao) {
        switch (operacao) {
            case 1: return numero1 + numero2;
            case 2: return numero1 - numero2;
            case 3: return numero1 * numero2;
            case 4:
                if (numero2 == 0) {
                    exibirMensagem("Erro: Divisão por zero não permitida.");
                    return Double.NaN;
                }
                return (double) numero1 / numero2;
            default:
                exibirMensagem("Operação inválida.");
                return Double.NaN;
        }
    }

    private static void exibirResultado(double resultado, int operacao) {
        String operacaoTexto = "";
        switch (operacao) {
            case 1: operacaoTexto = "Soma"; break;
            case 2: operacaoTexto = "Subtração"; break;
            case 3: operacaoTexto = "Multiplicação"; break;
            case 4: operacaoTexto = "Divisão"; break;
        }
        if (!Double.isNaN(resultado)) {
            exibirMensagem("Resultado da " + operacaoTexto + ": " + resultado);
        }
    }

    private static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

