public class Desafioo {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3) / 2;
        System.out.println(media);

        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}