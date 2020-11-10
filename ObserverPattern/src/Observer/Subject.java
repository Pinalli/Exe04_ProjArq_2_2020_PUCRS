package Observer;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */

//PRODUTO
public class Subject {
    
    
    ArrayList<String> produto;

    public  Subject () {
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
