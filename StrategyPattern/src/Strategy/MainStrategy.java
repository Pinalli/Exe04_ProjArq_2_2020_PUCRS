package Strategy;

import pagamento.Pagamento;
import pagamento.PayPal;


/*3 - Strategy e factory para implementar as diferentes formas de pagamento e
o acesso ao cliente a estas informações (cartão de débito, cartão de 
crédito, boleto bancário e paypal). */
/**
 *
 * @author AlbertoPinalli
 */
public class MainStrategy {

    public static void main(String[] args) {

        Produto p1 = new Produto("001", "Banana", 1.29);
        Produto p2 = new Produto("002", "Maçã", 2.89);

        Cliente c1 = new Cliente("001", "Edson");
        Cliente c2 = new Cliente("002", "Matheus");
        
        Carrinho c= new Carrinho(c1);
        c.inserir(p2, 2);
        
        Pagamento p =new Pagamento(PayPal);
        
        
        System.out.println(c.relatorio());
    }
}
