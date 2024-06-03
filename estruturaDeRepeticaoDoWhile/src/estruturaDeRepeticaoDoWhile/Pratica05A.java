package estruturaDeRepeticaoDoWhile;
import javax.swing.JOptionPane;

public class Pratica05A {
    public static void main(String[] args) {
        int quantidadeContas = 0;
        do {
            try {
                quantidadeContas = Integer.parseInt(JOptionPane.showInputDialog("Quantas contas deseja verificar?"));
                if (quantidadeContas <= 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido de contas.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        } while (quantidadeContas <= 0);

        int i = 0;
        do {
            String numeroConta;
            do {
                numeroConta = JOptionPane.showInputDialog("Informe o número da conta corrente (3 dígitos):");
                if (numeroConta.length() != 3) {
                    JOptionPane.showMessageDialog(null, "O número da conta deve ter exatamente 3 dígitos. Tente novamente.");
                }
            } while (numeroConta.length() != 3);

            int numero = Integer.parseInt(numeroConta);
            int inverso = Integer.parseInt(new StringBuilder(numeroConta).reverse().toString());
            int soma = numero + inverso;
            int[] digitos = new int[4];

            for (int j = 0; j < 4; j++) {
                digitos[j] = soma % 10;
                soma /= 10;
            }

            int digitoVerificador = (digitos[0] * 0) + (digitos[1] * 1) + (digitos[2] * 2) + (digitos[3] * 3);
            digitoVerificador %= 10;

            JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + numeroConta + " é: " + digitoVerificador);

            i++;
        } while (i < quantidadeContas);
    }
}
