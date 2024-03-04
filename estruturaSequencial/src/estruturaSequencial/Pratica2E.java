package estruturaSequencial;
import java.util.Scanner;
public class Pratica2E {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Informe o raio da esfera: ");
		double raio = scanner.nextDouble();

		double comprimento = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
		
		 comprimento = Math.round(comprimento * 100.0) / 100.0;
	     area = Math.round(area * 100.0) / 100.0;
	     volume = Math.round(volume * 100.0) / 100.0;

		System.out.println("O comprimento da esfera é: " + comprimento);
		System.out.println("A área da esfera é: " + area);
		System.out.println("O volume da esfera é: " + volume);

		scanner.close();


	}

}
