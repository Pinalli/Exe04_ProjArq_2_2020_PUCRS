
package pagamento;

/**
 *
 * @author AlbertoPinalli
 */
public class CartaoDebito implements Ipagamento {

    @Override
    public double calculaPreco(double valor) {
       return valor;
    }
    
}
