package Observer;

/**
 *
 * @author AlbertoPinalli
 */
//o carrinho
public class ConcreteObserver {

    Subject produto;

    ConcreteObserver() {
        produto = new Subject();
    }

    public void adicionar(String p) {
        this.produto.adicionar(p);
    }

    public void consultarProdutos() {
        produto.toString();
    }

}
