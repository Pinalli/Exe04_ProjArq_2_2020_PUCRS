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
/**
 *
 * @author AlbertoPinalli
 */
public class MainObserver {
    public static void main(String[] args) {
        
         ConcreteObserver c1 =  new ConcreteObserver();
            c1.adicionar("Notebook");
            c1.adicionar("SSD");
            c1.adicionar("Memória 3GB");
            c1.consultarProdutos();
        
            
            System.out.println("\n");
            
          
    }
}
