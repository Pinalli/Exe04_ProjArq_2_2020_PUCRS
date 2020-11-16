package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AlbertoPinalli
 */
public class Carrinho {
     public double valorTotal = 0;
    public Map<String, Double> lista = new HashMap<>();

    Carrinho() {
    }

    public void adicionar(String product, Double preco) {

        lista.put(product, preco);
    }

       public double getValorTotal() {
        return valorTotal;
    }

    public void printList() {
        lista.entrySet().forEach(entry -> {
            System.out.println("Descrição do item:" + entry.getKey() + "\nValor = R$" + entry.getValue());
        });
    }
}
