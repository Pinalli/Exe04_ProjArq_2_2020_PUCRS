package payment;

/**
 *
 * @author AlbertoPinalli
 */
public class CartaoDebito implements Pagamento {

    @Override
    public double calculaPreco(double valor) {
        return valor;
    }

}
