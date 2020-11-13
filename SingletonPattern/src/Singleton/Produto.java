package Singleton;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */
public class Produto {

    ArrayList<String> produto;

    public Produto() {
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
    
}
