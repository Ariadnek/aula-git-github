package refatoração4;
import javax.swing.JOptionPane;

public class Main {
	public static void main (String[] args) {
		// Declaração de variáveis:
		int idade = 0;
		String sexo = "", resp = null;
		boolean repetir = true;
		double nota = 0, salario = 0;
		/*-------------------------------
		 * Leitura e validação da nota:
		 *-------------------------------
		 */
		do {
				resp = JOptionPane.showInputDialog("Infome a nota [0, 10]", 0);
				// Verifica se o botão "cancelar foi pressionado."
				if (resp == null) {
						System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
						System.exit(1);
				}
				try {
						nota = Double.parseDouble(resp);
						if (nota >= 0 && nota <= 10)
								repetir = false;
						else
								repetir = true;
				} catch (NumberFormatException e) {
						System.err.println("ERRO: número não identificado.");
						repetir = true;
				}
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
		/*---------------------------------
		 * Leitura e validação do salário:
		 *---------------------------------
		 */
		do {
				resp = JOptionPane.showInputDialog("Infome o salário", 0);
				// Verifica se o botão "cancelar foi pressionado."
				if (resp == null) {

						System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

						System.exit(1);
				}
				try {
						salario = Double.parseDouble(resp);
						if (salario > 0)
								repetir = false;
						else
								repetir = true;
				} catch (NumberFormatException e) {
						System.err.println("ERRO: número não identificado.");
						repetir = true;
				}
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Salário informado: " + salario);
		/*-------------------------------
		 * Leitura e validação do sexo:
		 *-------------------------------
		 */
		do {
				sexo = JOptionPane.showInputDialog("Infome o sexo");
				// Verifica se o botão "cancelar foi pressionado."
				if (sexo == null) {
						System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

						System.exit(1);
				}
				if (sexo.equalsIgnoreCase("f") == true || sexo.equalsIgnoreCase("m") == true)

						repetir = false;
				else
						repetir = true;
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);
		/*-------------------------------
		 * Leitura e validação da idade:
		 *-------------------------------
		 */
		do {
				resp = JOptionPane.showInputDialog("Infome a idade", 6);
				// Verifica se o botão "cancelar foi pressionado."
				if (resp == null) {
						System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

						System.exit(1);
				}
				try {
						idade = Integer.parseInt(resp);
						if (idade >= 6 && idade <= 150)
								repetir = false;
						else
								repetir = true;
				} catch (NumberFormatException e) {
						System.err.println("ERRO: número não identificado.");
						repetir = true;
				}

		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
	}
}