package refatoração1;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    
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
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            System.out.println("Esta é uma equação de primeiro grau");
            double raiz = -c / b;
            System.out.printf("x = %.2f%n", raiz);
        } else {
            System.out.println("Esta é uma equação de segundo grau");
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.printf("Esta equação não possui raízes reais (delta < 0): delta = %.2f%n", delta);
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais");
                double raiz = -b / (2 * a);
                System.out.printf("x' = x'' = %.2f%n", raiz);
            } else {
                System.out.println("Esta é uma equação de segundo grau. Esta equação possui duas raízes reais diferentes");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("delta = %.2f, x' = %.2f, x'' = %.2f%n", delta, raiz1, raiz2);
            }
        }
    }
}
