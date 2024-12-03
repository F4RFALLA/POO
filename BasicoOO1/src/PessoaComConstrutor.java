import java.util.Calendar;

public class PessoaComConstrutor {
    String nome;
    int idade;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    // Construtor para ajustar a data de nascimento e calcular a idade
    public PessoaComConstrutor(int diaNascimento, int mesNascimento, int anoNascimento) {
        // Ajustando a data de nascimento
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;

        // Calculando a idade com a data ajustada
        this.idade = calculaIdade(this.diaNascimento, this.mesNascimento, this.anoNascimento);
    }

    // Método para calcular a idade com base na data de nascimento
    public static int calculaIdade(int diaNascimento, int mesNascimento, int anoNascimento) {
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - anoNascimento;

        // Ajuste para mês e dia
        if (hoje.get(Calendar.MONTH) < mesNascimento) {
            idade--;  // O aniversário ainda não ocorreu este ano
        } else if (hoje.get(Calendar.MONTH) == mesNascimento && hoje.get(Calendar.DAY_OF_MONTH) < diaNascimento) {
            idade--;  // O aniversário ainda não ocorreu neste mês
        }

        return idade;
    }

    // Método para informar o nome
    public static void informaNome(String nome) {
        System.out.println("Nome: " + nome);
    }

    // Método para informar a idade
    public static void informaIdade(int idade) {
        System.out.println("Idade: " + idade + " anos");
    }
}

