import java.util.Scanner;

public class Alura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("O ano de lançamento do filme " + filme +  " é " + anoDeLancamento);
        System.out.println("Digite sua avaliação");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme : " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);
    }
}
