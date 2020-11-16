package strategy;

import java.util.HashMap;
import java.util.Map;


/* O projeto deverá ser organizado usando o padrão arquitetural MVC ou Camadas.
O cenário de desenvolvimento é um sistema de e-commerce, onde clientes podem
consultar produtos, inserir produtos em um carrinho de compras e finalizar esta compra.
 */
/**
 *
 * @author AlbertoPinalli
 */
public class Carrinho {

    public Map<String, Double> lista = new HashMap<>();
    public double valorTotal = 0;

    Carrinho() {}

    public void adicionar(String product, Double preco) {

        lista.put(product, preco);
        valorTotal += preco;
    }

    public void printList() {
        System.out.println("######## Carrinho ########\n");
        lista.forEach((key, value) -> System.out.println("Produto: " + key + ", R$" + value));
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
