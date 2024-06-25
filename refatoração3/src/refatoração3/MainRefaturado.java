package refatoração3;

public class MainRefaturado {

	public static void main(String[] args) {
		double vet1[] = { 90, 88, 78, 76 };
        double vet2[] = { 865, 564, 43, 12 };
        
        System.out.println("Média do vetor 1: " + calcularMedia(vet1));
        System.out.println("Média do vetor 2: " + calcularMedia(vet2));
    }
	
	public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
	}

}
