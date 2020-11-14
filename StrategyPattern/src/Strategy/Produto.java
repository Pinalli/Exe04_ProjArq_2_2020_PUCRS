package Strategy;
/**
 *
 * @author AlbertoPinalli
 */
public class Produto {

   private String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = precoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return preco;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.preco = precoUnitario;
    }

    // mostra as informações do produto
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        if (nome.length() < 8) {
            msg.append(codigo).append("\t").append(nome).append("\t\tR$ ").append(preco);
        }else{
            msg.append(codigo).append("\t").append(nome).append("\tR$ ").append(preco);
        }
        return msg.toString();
    }
}
