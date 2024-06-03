package refatoração1;
import java.util.Scanner;

public class EquacaoSGRefatorada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Informe o valor do coeficiente a: ");
            double a = scanner.nextDouble();
            System.out.print("Informe o valor do coeficiente b: ");
            double b = scanner.nextDouble();
            System.out.print("Informe o valor do coeficiente c: ");
            double c = scanner.nextDouble();
            
            resolverEquacao(a, b, c);
            
            System.out.print("Deseja resolver outra equação? (s/n): ");
            continuar = scanner.next();
        }
        
        scanner.close();
    }
    
    public static void resolverEquacao(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            igualdadeConfirmada();
        } else if (a == 0 && b == 0) {
            coeficientesIncorretos();
        } else if (a == 0) {
            resolverEquacaoPrimeiroGrau(b, c);
        } else {
            resolverEquacaoSegundoGrau(a, b, c);
        }
    }
    
    public static void igualdadeConfirmada() {
        System.out.println("Igualdade confirmada: 0 = 0");
    }
    
    public static void coeficientesIncorretos() {
        System.out.println("Coeficientes informados incorretamente");
    }
    
    public static void resolverEquacaoPrimeiroGrau(double b, double c) {
        System.out.println("Esta é uma equação de primeiro grau");
        double raiz = -c / b;
        System.out.printf("x = %.2f%n", raiz);
    }
    
    public static void resolverEquacaoSegundoGrau(double a, double b, double c) {
        System.out.println("Esta é uma equação de segundo grau");
        double delta = calcularDelta(a, b, c);
        
        if (delta < 0) {
            equacaoSemRaizesReais(delta);
        } else if (delta == 0) {
            equacaoComRaizesIguais(a, b);
        } else {
            equacaoComRaizesDiferentes(a, b, delta);
        }
    }
    
    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    
    public static void equacaoSemRaizesReais(double delta) {
        System.out.printf("Esta equação não possui raízes reais (delta < 0): delta = %.2f%n", delta);
    }
    
    public static void equacaoComRaizesIguais(double a, double b) {
        System.out.println("Esta equação possui duas raízes reais iguais");
        double raiz = -b / (2 * a);
        System.out.printf("x' = x'' = %.2f%n", raiz);
    }
    
    public static void equacaoComRaizesDiferentes(double a, double b, double delta) {
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("delta = %.2f, x' = %.2f, x'' = %.2f%n", delta, raiz1, raiz2);
    }
}
