
package Strategy;

import java.util.ArrayList;

/**
 *
 * @author AlbertoPinalli
 */
public class CadastroProduto {
    private ArrayList<Produto> lista;
    
    public CadastroProduto(){
        lista = new ArrayList<>();
    }
    
    // insere um produto
    public boolean inserir(Produto produto){
        for(int i = 0; i < lista.size(); i++){
            if(produto.getCodigo().equals(lista.get(i).getCodigo())){
                return false;
            }
        }
        lista.add(produto);
        return true;
    }
    
    // pesquisa um produto a partir do seu codigo
    public Produto pesquisar(String codigo){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCodigo().equals(codigo)){
                return lista.get(i);
            }
        }
        return null;
    }
    
    // mostra as informações da lista de produtos 
    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder();
        if(lista.isEmpty()){
            msg.append("lista vazia");
        }else{
            for(Produto p : lista){
                msg.append(p).append("\n");
            }
        }
        return msg.toString();
    }
}
