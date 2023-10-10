import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");

        String [] candidatos = {"FELIPE", "ANA", "JULIA", "MARCOS", "VINICIUS", "PEDRO", "MARCIA", "JOSÉ", "CARLA", "CARLOS"};
        String [] selecionados = {};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga!");

                selecionados = append(selecionados , candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

        for (String cl : selecionados) {
            entrandoEmContato(cl);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Ligação realizada com sucesso!");
            }
        } while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de " + tentativasRealizadas + " tentativas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    private static String[] append(String[] arr, String element)
    {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
 
        return list.toArray(new String[0]);
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCondidato (double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGAURDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
