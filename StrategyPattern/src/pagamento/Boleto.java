
package pagamento;

/**
 *
 * @author AlbertoPinalli
 */
public class Boleto implements  Ipagamento{

    @Override
    public double calculaPreco(double valor) {
        return valor * 0.05 + 5;
    }
    
}
