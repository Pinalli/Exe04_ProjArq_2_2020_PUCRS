
package pagamento;

/**
 *
 * @author AlbertoPinalli
 */
public class PayPal implements Ipagamento {

    @Override
    public double calculaPreco(double valor) {
        return valor * 0.10;
    }
    
   
}
