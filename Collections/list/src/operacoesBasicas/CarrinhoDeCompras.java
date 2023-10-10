package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        if (!listaCompras.isEmpty()) {
            for(Item i : listaCompras){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItem.add(i);
                }
            }
        }
        listaCompras.removeAll(removerItem);
    }

    public void calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item v : listaCompras){
            valorTotal += v.getPreco() * v.getQuantidade();
        }
        System.out.println("O valor total das compras são de: " + valorTotal);
    }

    public void exibirItens() {
        for (Item item : listaCompras) {
            System.out.println("Produto: " + item.getNome() + " R$: " + item.getPreco() + " QTD: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Celular", 2000.0, 1);
        compras.adicionarItem("Fone", 40.0, 1);
        compras.adicionarItem("Capinha", 20.0, 2);
        compras.adicionarItem("acessorio", 20.0, 1);

        compras.calcularValorTotal();

        compras.removerItem("acessorio");

        compras.exibirItens();

        compras.calcularValorTotal();
    }
}
