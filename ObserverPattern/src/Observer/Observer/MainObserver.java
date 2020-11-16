package Observer;

import java.util.Scanner;

// 2 - Observer, atualização do carrinho a cada produto selecionado pelo cliente;
/**
 *
 * @author AlbertoPinalli
 */
public class MainObserver {

    public static void main(String[] args) {

        ConcreteObserver c1 = new ConcreteObserver();
        Subject s = new Subject();

        c1.addObserver(s);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Adicione um produto ao carrinho");
            String p = sc.nextLine();
            System.out.println("Produto adicionado: " + p + "\n");
            c1.adicionar(p);
  
        }

    }
}
