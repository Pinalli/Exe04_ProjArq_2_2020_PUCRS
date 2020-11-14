
package Strategy;

/**
 *
 * @author AlbertoPinalli
 */
public class ItemVenda {

    private Produto produto;
    private int quantidadeComprada;

    // construtor de ItemVenda
    public ItemVenda(Produto produto, int quantidadeComprada) {
        this.produto = produto;
        this.quantidadeComprada = quantidadeComprada;
    }

    // calcula o preço total
    public double total() {
        return produto.getPrecoUnitario() * quantidadeComprada;
    }

    // Converte um double para String e mostra apenas as duas primeiras casas após a virgula
    public String converter() {
        String resultado = String.format("%.2f", total());
        return resultado;
    }

    // mostra as informações dO item vendido
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append(produto).append("\t\t").append(quantidadeComprada).append("\tR$ ").append(converter());
        return msg.toString();
    }
}
