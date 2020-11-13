package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Um item foi inserido!");
        System.out.println("Atualização do carrinho!");
        System.out.println("Prdutos no carrinho:  " + produto + "\n");

    }

}
