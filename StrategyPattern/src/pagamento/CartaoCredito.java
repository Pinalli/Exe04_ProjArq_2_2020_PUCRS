
package pagamento;

/**
 *
 * @author AlbertoPinalli
 */
public class CartaoCredito implements Ipagamento {

    @Override
    public double calculaPreco(double valor) {
        return valor * 0.15;
    }
    
}
