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

        boolean finalizouCompra = false;
        boolean selecionouOpcao;

        Carrinho c1 = new Carrinho();

        while (!finalizouCompra) {
            selecionouOpcao = false;
            Scanner sc = new Scanner(System.in);
            System.out.print("Informe o nome do produto: ");
            String produto = sc.nextLine();

            System.out.print("Informe o valor do produto: ");
            double valor = sc.nextDouble();
            c1.adicionar(produto, valor);

            while (!selecionouOpcao) {
                System.out.println("1. Realizar outra compra \n2. Finalizar carrinho");
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1: {
                        selecionouOpcao = true;
                        break;
                    }
                    case 2: {
                        System.out.println("Selecione a forma de pagamento:");
                        System.out.println(
                                "1. PayPal \n2. Cartão de débito \n3. Cartão de crédito" + "\n4. Boleto bancário");
                        opcao = sc.nextInt();
                        TipoPagamento tp = TipoPagamento.values()[opcao - 1];
                        Pagamento pg = tp.valorPag();

                        double precoTotal = pg.calculaPreco(valor);

                        System.out.println("\n\nCompra finalizada!");
                        c1.printList();
                        System.out.println("\nValor total a pagar: R$" + (precoTotal + valor) + "\n");
                        selecionouOpcao = true;
                        finalizouCompra = true;
                        c1.adicionar(produto, valor);
                        c1.printList();
                        break;

                    }
                }
            }
        }

    }

}
