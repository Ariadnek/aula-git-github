package refatoração5;
import javax.swing.JOptionPane;

public class MainRefaturado {
    public static void main(String[] args) {
        // Declaração de variáveis:
        int opcao;
        double lado01, lado02, lado03;

        do {
            // Lendo os lados do triângulo:
            lado01 = lerLado("Informe o primeiro lado:");
            lado02 = lerLado("Informe o segundo lado:");
            lado03 = lerLado("Informe o terceiro lado:");
            
            // Cálculo (processamento):
            if (lado01 == lado02 && lado02 == lado03) {
                JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
            } else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03) {
                JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
            }
            
            // Verifica se o usuário deseja continuar
            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);
    }

    // Método para ler um lado do triângulo
    private static double lerLado(String mensagem) {
        boolean repetir;
        double lado = 0;
        String resp;
        do {
            resp = JOptionPane.showInputDialog(mensagem, 0);
            // Verifica se o botão "cancelar" foi pressionado:
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                System.exit(0);
            }
            // Verifica se um número válido foi informado:
            try {
                lado = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        return lado;
    }
}
