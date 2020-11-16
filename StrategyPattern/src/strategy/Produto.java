package strategy;


/**
 *
 * @author AlbertoPinalli
 */
public class Produto {

    private Double preco;
    private String produto;

    public Produto(Double preco, String produto) {
        this.preco = preco;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto;
    }
}
