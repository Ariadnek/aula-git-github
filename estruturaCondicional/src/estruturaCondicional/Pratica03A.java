package estruturaCondicional;
import java.util.Scanner;

public class Pratica03A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Informe o sexo do cliente (M para Masculino) (F para Feminino)");
        char sexo = scanner.next().charAt(0);
        
        double mensalidade = CalcularMensalidade(idade, sexo);
        
        if (mensalidade != -1) {
            System.out.println("O valor da mensalidade a ser paga é: " + mensalidade);
        } else {
            System.out.println("Sexo informado inválido.");
        }

        scanner.close();
    }

    public static double CalcularMensalidade(int idade, char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            if (idade <= 15) {
                return 60.00;
            } else if (idade <= 18) {
                return 75.00;
            } else if (idade <= 25) {
                return 90.00;
            } else if (idade <= 40) {
                return 85.00;
            } else {
                return 80.00;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade <= 18) {
                return 60.00;
            } else if (idade <= 25) {
                return 90.00;
            } else if (idade <= 30) {
                return 90.00;
            } else if (idade <= 40) {
                return 85.00;
            } else {
                return 80.00;
            }
        } else {
            
            return -1;
        }
    }
}
