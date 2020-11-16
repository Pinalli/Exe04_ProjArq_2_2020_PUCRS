package payment;

/**
 *
 * @author AlbertoPinalli
 */
public class Boleto implements Pagamento {

    @Override
    public double calculaPreco(double valor) {
        return (valor * 0.20) + 5;
    }

}
