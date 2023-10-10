import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final String BR = "BRasil"; // final garante que o valor da variavel não altere e Por convenção o nome da variável em letra maiúscula 

        String primeiroNome = "Crislayne";
        String segundoNome = "Ramos";

        System.out.println(NomeCompleto( primeiroNome, segundoNome));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        if (nome.equals("Cris")) {
            System.out.println(nome + " tem altura de " + altura + " m e tem " + idade + " anos!");
        } else {
            System.out.println("Sem nome!");
        }

        // Condição aninhada

        System.out.println("Dgite sua nota: ");
        int nota = scanner.nextInt();

        if (nota < 5) {
            System.out.println("Reprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Aprovado!");
        }

        // Condçao ternária

        String resultado = nota < 5 ? "Reprovado!" : nota >= 5 && nota < 7 ? "Recuperação" : "Aprovado!";
        System.out.println(resultado);

        // Switch case
        String sigla = "M";
        switch ( sigla ) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
        }
    }

    public static String NomeCompleto (String pNome, String sNome) {
        return pNome.concat(" ").concat(sNome);
    }
}
