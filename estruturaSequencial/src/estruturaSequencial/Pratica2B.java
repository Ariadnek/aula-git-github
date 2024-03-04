package estruturaSequencial;
import java.util.Scanner;

public class Pratica2B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius:");
        double temperaturaCelsius = input.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        input.close();
    }

}
