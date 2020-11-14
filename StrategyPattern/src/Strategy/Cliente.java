
package Strategy;

/**
 *
 * @author AlbertoPinalli
 */
class Cliente {
    
    private String codigo;
    private String nome;
    
    public Cliente(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
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
    
    // mostra as informações do cliente
    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder();
        msg.append(codigo).append("\t").append(nome);
        return msg.toString();
    }
}
