/*
1 - singleton, para garantir um único carrinho de compras para um cliente;
2 - observer, atualização do carrinho a cada produto selecionado pelo cliente;
3 - strategy e factory para implementar as diferentes formas de pagamento e
o acesso ao cliente a estas informações (cartão de débito, cartão de 
crédito, boleto bancário e paypal).
4 - fachada; classe a ser definida na camada de negócios como um único
ponto de acesso da camada de apresentação a ela
 */
package Observer;

import java.util.Scanner;

/**
 *
 * @author AlbertoPinalli
 */
public class MainObserver {

    public static void main(String[] args) {

        ConcreteObserver c1 = new ConcreteObserver();
        Subject s = new  Subject();

        c1.addObserver(s);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha um produto para adicionar ao carrinho");
            String p = sc.nextLine();
            c1.adicionar(p);
        }

        /// c1.toString();
        // p.adicionar("Memória 3GB");
        // p.adicionar("Tenis");
        // System.out.println(c1.toString());
        /// c1.toString();
        // p.toString();
        // System.out.println("\n");
    }
}
