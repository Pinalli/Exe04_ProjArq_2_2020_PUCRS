package Observer;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */
// Classe observada
public class ConcreteObserver {

    public ArrayList<String> produto = new ArrayList<>();
    public ArrayList<Observer> obs = new ArrayList<>();

    ConcreteObserver() {
        produto = new ArrayList<>();
    }

    public void adicionar(String p) {
        produto.add(p);
        notificarObserver();
    }

    public void addObserver(Observer o) {
        if (!obs.contains(o)) {
            obs.add(o);
        }
    }

    public void removeObserver(Observer o) {
        obs.remove(o);
    }

    public void notificarObserver() {

        for (Observer o : obs) {
            o.inseriu(produto);

        }

    }

    @Override
    public String toString() {
        return "Lista dos Produtos no carrinho:\n" + produto;
    }
}
