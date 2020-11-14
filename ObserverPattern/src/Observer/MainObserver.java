/*

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
            System.out.println("Adicione um produto ao carrinho");
            String p = sc.nextLine();
            c1.adicionar(p);
        }

      
    }
}
