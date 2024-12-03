import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        // Entrada de dados
        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota parcial (0 a 100): ");
            int primeiraNota = scanner.nextInt();

            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int segundaNota = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Aluno aluno = new Aluno(nome, primeiraNota, segundaNota);
            alunos.add(aluno);
        }

        // Processamento
        if (!alunos.isEmpty()) {
            double somaMedias = 0.0;
            int aprovados = 0, finais = 0, reprovados = 0;

            for (Aluno aluno : alunos) {
                double media = aluno.calcularMedia();
                somaMedias += media;

                if (media >= 70) {
                    aprovados++;
                } else if (media >= 40) {
                    finais++;
                } else {
                    reprovados++;
                }
            }

            double mediaTurma = somaMedias / alunos.size();

            // Resultados
            System.out.println("\nResultados:");
            System.out.printf("Média da turma: %.2f%n", mediaTurma);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Em final: " + finais);
            System.out.println("Reprovados: " + reprovados);

            System.out.println("\nAlunos com nota abaixo da média da turma:");
            for (Aluno aluno : alunos) {
                if (aluno.calcularMedia() < mediaTurma) {
                    System.out.println("Nome: " + aluno.getNome());
                }
            }
        } else {
            System.out.println("Nenhum aluno foi inserido.");
        }

        scanner.close();
    }
}

