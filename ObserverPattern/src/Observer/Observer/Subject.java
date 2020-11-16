package Observer;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */
public class Subject implements Observer {

    ArrayList<String> produto;

    public Subject() {
        this.produto = new ArrayList<>();
    }

    public void adicionar(String p) {
        produto.add(p);

    }

    @Override
    public String toString() {
        produto.forEach((p) -> {
            System.out.println(p);
        });
        return null;

    }

    public void consultarProdutos() {
        produto.toString();

    }

    @Override
    public void inseriu(ArrayList<String> produto) {
        System.out.println("ATUALIZAÇÃO!");
        System.out.println("Um item foi inserido no carrinho");
        System.out.println("Lista de produtos:  " + produto + "\n");

    }

}
