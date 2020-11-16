package strategy;

import java.util.Scanner;
import payment.Pagamento;
import payment.TipoPagamento;

/**
 *
 * @author AlbertoPinalli
 */
public class MainStrategy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carrinho c1 = new Carrinho();

        System.out.println("Informe o produto");
        String produto = sc.nextLine();
        System.out.println("Informe o valor");
        double valor = sc.nextDouble();
        c1.adicionar(produto, valor);

        System.out.println("Selecione a forma de pagamento:");
        System.out.println("(1)PayPal (2)Cartão de débito (3)Cartão de crédito"
                + " (4)Boleto bancário:");
        int opcao = sc.nextInt();
        TipoPagamento tp = TipoPagamento.values()[opcao - 1];

        Pagamento pg = tp.valorPag();
        double precoTotal = pg.calculaPreco(valor);
        c1.printList();
        System.out.println("Valor total a pagar = R$" + (precoTotal + valor));

    }

}
