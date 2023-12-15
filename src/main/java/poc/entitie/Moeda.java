package poc.entitie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Moeda {

    private Integer id;
    private String nome;
    private Double valor;
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDatacompra() {
        return data;
    }

    public void setDatacompra(String data) {
        this.data = data;
    }

    public Moeda(Integer id, String nome, Double valor, String data) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
    }
}
