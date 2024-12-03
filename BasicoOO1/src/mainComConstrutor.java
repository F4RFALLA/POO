import java.util.Scanner;

public class mainComConstrutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome da pessoa
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Pedindo a data de nascimento da pessoa
        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Digite o mês de nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Criando o objeto 'Pessoa' com o construtor
        PessoaComConstrutor pessoa = new PessoaComConstrutor(diaNascimento, mesNascimento, anoNascimento);
        pessoa.nome = nome;  // Atribuindo o nome após a criação do objeto

        // Chamando o método para imprimir o nome
        PessoaComConstrutor.informaNome(pessoa.nome);

        // Chamando o método para imprimir a idade
        PessoaComConstrutor.informaIdade(pessoa.idade);

        scanner.close();
    }
}
