import java.util.Calendar;

public class Pessoa {
    String nome;
    int idade;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public static int calculaIdade(int diaNascimento, int mesNascimento, int anoNascimento, int idade) {
        Calendar hoje = Calendar.getInstance();

        idade = hoje.get(Calendar.YEAR) - anoNascimento;

        if (hoje.get(Calendar.MONTH) < mesNascimento){
            idade--;
        }
        else if (hoje.get(Calendar.MONTH)==mesNascimento && hoje.get(Calendar.DAY_OF_MONTH) < diaNascimento){
            idade--;
        }
        return idade;
    }

    public static void informaIdade(int idade){
        System.out.println("Idade: " + idade + " anos");
    }

    public static void informaNome(String nome){
        System.out.println(nome);
    }

    public void ajustaDataNascimento(int diaNascimento, int mesNascimento, int anoNascimento){
        int novoDiaNascimento = 0;
        int novoMesNascimento = 0;
        int novoAnoNascimento = 0;

        this.diaNascimento = novoDiaNascimento;
        this.mesNascimento = novoMesNascimento;
        this.anoNascimento = novoAnoNascimento;

        System.out.println("Nova data de nascimento ajustada: "+ novoDiaNascimento + "/" + novoMesNascimento + "/" + novoAnoNascimento);
    }
}