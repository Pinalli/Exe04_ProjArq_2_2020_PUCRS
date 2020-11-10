package Observer;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */
//Envia notificação de mudança de Subject para os seus Observers
public class ConcreteSubject implements Observer {

    @Override
    public void adicionouProduto(ArrayList<String> produtos) {
        System.out.println("Notificação \n");
        System.out.println("Produtos adicionados: " + produtos);

    }

}
