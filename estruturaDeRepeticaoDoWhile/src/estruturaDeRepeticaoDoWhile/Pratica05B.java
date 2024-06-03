package estruturaDeRepeticaoDoWhile;
import javax.swing.JOptionPane;
public class Pratica05B {

	public static void main(String[] args) {
		        double nota = 0;
		        while (nota < 0 || nota > 10) {
		            try {
		                nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):"));
		                if (nota < 0 || nota > 10) {
		                    JOptionPane.showMessageDialog(null, "A nota deve estar entre 0 e 10. Tente novamente.");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Nota válida!");
		                }
		            } catch (NumberFormatException e) {
		                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
		            }
		        }

		        double salario = 0;
		        while (salario <= 0) {
		            try {
		                salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário (maior que zero):"));
		                if (salario <= 0) {
		                    JOptionPane.showMessageDialog(null, "O salário deve ser maior que zero. Tente novamente.");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Salário válido!");
		                }
		            } catch (NumberFormatException e) {
		                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
		            }
		        }

		        String sexo = "";
		        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
		            sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
		            if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
		                JOptionPane.showMessageDialog(null, "O sexo deve ser 'm' ou 'f'. Tente novamente.");
		            } else {
		                JOptionPane.showMessageDialog(null, "Sexo válido!");
		            }
		        }

		        int idade = 0;
		        while (idade < 0 || idade > 150) {
		            try {
		                idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade (entre 0 e 150):"));
		                if (idade < 0 || idade > 150) {
		                    JOptionPane.showMessageDialog(null, "A idade deve estar entre 0 e 150. Tente novamente.");
		                } else {
		                    JOptionPane.showMessageDialog(null, "Idade válida!");
		                }
		            } catch (NumberFormatException e) {
		                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
		            }
		        }
		    }
		}
