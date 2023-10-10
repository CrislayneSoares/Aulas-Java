import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println(nome + " " + sobrenome + " tem " + idade + " anos e tem " + altura + " altura.");
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos!");
        }
    }
}
