import java.util.Scanner;

public class mainPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome: ");
        pessoa.nome = scanner.nextLine();

        // Pedindo a data de nascimento da pessoa
        System.out.print("Digite o dia de nascimento: ");
        pessoa.diaNascimento = scanner.nextInt();
        System.out.print("Digite o mês de nascimento (1-12): ");
        pessoa.mesNascimento = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        pessoa.anoNascimento = scanner.nextInt();

        pessoa.idade = Pessoa.calculaIdade(pessoa.diaNascimento, pessoa.mesNascimento, pessoa.anoNascimento, pessoa.idade);

        Pessoa.informaNome(pessoa.nome);
        Pessoa.informaIdade(pessoa.idade);

        pessoa.ajustaDataNascimento(15, 12, 1990);

        pessoa.idade = Pessoa.calculaIdade(pessoa.diaNascimento, pessoa.mesNascimento, pessoa.anoNascimento, pessoa.idade);

        Pessoa.informaNome(pessoa.nome);

        System.out.println("Após o ajuste da data de nascimento:");
        Pessoa.informaIdade(pessoa.idade);
    }
}
