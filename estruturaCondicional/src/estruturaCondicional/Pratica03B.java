package estruturaCondicional;
import java.util.Scanner;

public class Pratica03B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tipo de apto: (S para Simples e D para Duplo");
		char apto = scanner.next().charAt(0);
		
		System.out.println("Informe as diárias: ");
		int diarias = scanner.nextInt();
		
		double pagamento = CalculoPagamento(apto, diarias);
		
		 if (pagamento != -1) {
	            System.out.println("O valor da diária a ser paga é: " + pagamento);
	       
		 }

	     scanner.close();
	 }

public static double CalculoPagamento (char apto, int diarias) {
	if (apto == 'S' || apto == 's') {
			if (diarias < 10) {
				return 100.00;
			}	else if (diarias >= 10 && diarias <= 15) {
					return 90.00;
			}	else if (diarias > 15) {
					return 80.00;
			}
	}	else if(apto == 'D' || apto == 'd') {
				if (diarias < 10) {
					return 140.00; 
			}  else if (diarias >= 10 && diarias <= 15) {
					return 120.00;
			}  else if (diarias > 15) {
					return 100.00;
			}
		}  		            
		            return -1;
				}
				
}
			
			
			

			

