
package payment;

/**
 *
 * @author AlbertoPinalli
 */
public class PayPal implements Pagamento {

    
    @Override
    public double calculaPreco(double valor) {
        return valor * 0.60;
    }
    
   
}
