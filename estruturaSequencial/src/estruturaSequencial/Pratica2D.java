package estruturaSequencial;

import java.util.Scanner;

public class Pratica2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro cateto (b): ");
		double cateto1 = scanner.nextDouble();
		
		System.out.println("Informe o valor do segundo cateto (c): ");
		double cateto2 = scanner.nextDouble();
		
		double hipotenusa =Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
		
		System.out.printf("O valor da hipotenusa (a) é: %.2f%n", hipotenusa);

		
		scanner.close();

	}

}
