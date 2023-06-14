package entidade;

/**
 *
 * @author mateus
 */
public class Cidade {
    private int id;
    private String descricao;
    private int cidade_id;

    public Cidade(int id, String descricao, int estado_id) {
        this.id = id;
        this.descricao = descricao;
        this.cidade_id = estado_id;
    }

    public Cidade(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstado_id() {
        return cidade_id;
    }

    public void setEstado_id(int estado_id) {
        this.cidade_id = estado_id;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.id + " | Descrição: " + this.descricao + " | EstadoID: " + this.cidade_id;
    }
    
}
