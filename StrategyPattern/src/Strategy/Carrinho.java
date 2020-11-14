package Strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AlbertoPinalli
 */
public class Carrinho {

 //   private LocalDate data;
    private Cliente cliente;
    private ArrayList<ItemVenda> lista;


    public Carrinho( Cliente cliente) {
      //  this.data = data;
        this.cliente = cliente;
        lista = new ArrayList<>();
    }


    // insere um item vendido
    public void inserir(Produto p, int q) {
        ItemVenda iv = new ItemVenda(p, q);
        lista.add(iv);
    }

    // mostra as informações da venda
    public String relatorio() {
        StringBuilder msg = new StringBuilder();
        
        // formata a data de yyyy-MM-dd para dd/MM/yyyy e a converte para String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     //   String hojeFormatado = data.format(formatter);
        
        msg.append("---------------------------------------------------------\n");
        msg.append("Cód:").append("\t").append("Nome:").append("\t\t").append("\n");
        msg.append(cliente).append("\t\t").append("\n");
        msg.append("---------------------------------------------------------");
        msg.append("\n").append("Código:").append("\t").append("Produto:").append("\t").append("Preço Unit:").append("\t").append("Qtd:").append("\t").append("Total:").append("\n");
        if (lista.isEmpty()) {
            msg.append("Sem vendas");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                msg.append(lista.get(i)).append("\n");
            }
        }
        msg.append("---------------------------------------------------------\n");
        return msg.toString();
    }
}
