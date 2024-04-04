package estruturaDeRepetição;
import java.util.Scanner;

public class Pratica04A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunosAprovados90 = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Informe a nota do aluno (ou nota negativa para sair):");
        double nota = scanner.nextDouble();

        while (nota >= 0) {
            System.out.println("Informe o total de faltas do aluno:");
            int faltas = scanner.nextInt();

            if (nota >= 90) {
                alunosAprovados90++;
            } else if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
            totalAlunos++;

            System.out.println("Informe a nota do próximo aluno (ou nota negativa para sair):");
            nota = scanner.nextDouble();
        }

        if (totalAlunos > 0) {
            System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + alunosAprovados90);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + (somaNotas / totalAlunos));
        } else {
            System.out.println("Nenhuma nota foi informada!");
        }
    }
}
