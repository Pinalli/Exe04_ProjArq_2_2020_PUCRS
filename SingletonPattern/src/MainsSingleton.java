
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
        System.out.println("Produtos da primeiro carrinho");
        c1.consultarProdutos();
       
        
        System.out.println("\n");

        Carrinho c2 = Carrinho.getInstance();
        c2.adicionar("Caderno");
        c2.adicionar("Lápis");
        c2.adicionar("Borracha");
        System.out.println("Produtos do segundo carrinho");
        c2.consultarProdutos();

        System.out.println("\n");

        Carrinho c3 = Carrinho.getInstance();
        c3.adicionar("Mochila");
        c3.adicionar("Bermuda");
        c3.adicionar("Camiseta Polo");
        System.out.println("Produtos do terceiro carrinho");
        c3.consultarProdutos();
    }
}
