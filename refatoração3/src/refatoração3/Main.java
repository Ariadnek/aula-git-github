package refatoração3;

public class Main {

	public static void main(String[] args) {
		double vet1[] = { 90, 88, 78, 76 };
		double vet2[] = { 865, 564, 43, 12 };
		
		double soma = 0;	
		
		for (int i = 0; i < 4; i++)
			soma = soma + vet1[i];
		
		double media = soma / 4;
		System.out.println("Média do vetor 1: " + media);
		
		soma = 0;
		for (int i = 0; i < 4; i++)
			soma = soma + vet2[i];
		
		media = soma / 4;
		System.out.println("Média do vetor 2: " + media);
	}

}
