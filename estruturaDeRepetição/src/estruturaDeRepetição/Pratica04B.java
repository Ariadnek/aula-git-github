package estruturaDeRepetição;
import java.util.Scanner;
public class Pratica04B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double salarioPopulacao = 0;
		int numFilhosTotal = 0;
		int contador = 0;
		
		while (true) {	
			System.out.println("Informe seu salário: (Para encerrar, insira -1)");
			double salario = scanner.nextDouble();
			
		
			if (salario < 0) {
				break;
			}
		
			salarioPopulacao += salario;
			
			System.out.println("Informe o número de filhos: ");
			int numFilhos = scanner.nextInt();
			numFilhosTotal += numFilhos;
			
			contador++;
		
		}
		
		if (contador == 0) {
            System.out.println("Nenhum dado foi inserido.");
        } else {
            double mediaSalario = salarioPopulacao / contador;
            double mediaFilhos = (double) numFilhosTotal / contador;

            System.out.println("Média Salarial: " + mediaSalario);
            System.out.println("Média de Filhos: " + mediaFilhos);
        }
	}

}
