
package payment;

/**
 *
 * @author AlbertoPinalli
 */
public class CartaoCredito implements Pagamento {

    @Override
    public double calculaPreco(double valor) {
        return valor * 0.17;
    }
    
}
