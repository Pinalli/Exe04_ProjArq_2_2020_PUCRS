package Singleton;

/* O projeto deverá ser organizado usando o padrão arquitetural MVC ou Camadas.
O cenário de desenvolvimento é um sistema de e-commerce, onde clientes podem
consultar produtos, inserir produtos em um carrinho de compras e finalizar esta compra.
 */
/**
 *
 * @author AlbertoPinalli
 */
public class Carrinho {

    private static Carrinho uniqueInstance = null;
    Produto produto;

    private Carrinho() {
        produto = new Produto();
    }

    static Carrinho getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Carrinho();
        }
        return uniqueInstance;
    }

    public void adicionar(String p) {
        this.produto.adicionar(p);
    }

    public void consultarProdutos() {
        produto.toString();
    }

}
