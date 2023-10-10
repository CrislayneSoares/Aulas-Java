package ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> ordenacaoNumeros;
    
    public OrdenacaoNumeros() {
        this.ordenacaoNumeros = new ArrayList<>();
    }
    

    public void adicionarNumero(int numero) {
        ordenacaoNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAcendentes = new ArrayList<>(this.ordenacaoNumeros);
        Collections.sort(numerosAcendentes);
        return numerosAcendentes;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.ordenacaoNumeros);
        numerosDescendentes.sort(Collections.reverseOrder());
        return numerosDescendentes;
    }

    public void exibirNumeros() {
        if (!ordenacaoNumeros.isEmpty()) {
          System.out.println(this.ordenacaoNumeros);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
      }
}
