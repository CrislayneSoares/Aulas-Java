package somarNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {
    private List<Integer> numerosInteiros = new ArrayList<>();

    public SomarNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int somar = 0;
        for (int i : numerosInteiros) {
            somar += i;
        }
        return somar;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        for (int i : numerosInteiros) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        for (int i : numerosInteiros) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        for (int i : numerosInteiros) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SomarNumeros somarNumeros = new SomarNumeros();

        // somarNumeros.adicionarNumero(1);
        // somarNumeros.adicionarNumero(5);
        // somarNumeros.adicionarNumero(3);
        somarNumeros.adicionarNumero(4);
        somarNumeros.adicionarNumero(7);
        somarNumeros.adicionarNumero(2);
        somarNumeros.adicionarNumero(8);

        System.out.println("A soma dos números é: " + somarNumeros.calcularSoma());

        System.out.println("O maior número é: " + somarNumeros.encontrarMaiorNumero());
        
        System.out.println("O menor número é: " + somarNumeros.encontrarMenorNumero());

        somarNumeros.exibirNumeros();
    }
}
