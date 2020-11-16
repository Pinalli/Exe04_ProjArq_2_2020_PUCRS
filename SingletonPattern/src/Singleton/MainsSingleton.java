package Singleton;

//1 - singleton, para garantir um único carrinho de compras para um cliente;
/**
 *
 * @author AlbertoPinalli
 */
public class MainsSingleton {

    public static void main(String[] args) {

        Carrinho c1 = Carrinho.getInstance();

        c1.adicionar("Notebook");
        c1.adicionar("SSD");
        c1.adicionar("Memória 3GB");
        System.out.println("Primeiros produtos inseridos");
        c1.consultarProdutos();

        System.out.println("\n");

        Carrinho c2 = Carrinho.getInstance();
        c2.adicionar("Caderno");
        c2.adicionar("Lápis");
        c2.adicionar("Borracha");
        System.out.println("Lista dos produtos adicionados no carrinho");
        c2.consultarProdutos();

    }
}
