package entidade;

public class Produto {
    private static Integer contadorProduto = 1;
    private Integer id;
    private String codigo;
    private String nome;
    private String descricao;
    private Float preco;


    public Produto(String codigo, String nome, String descricao, Float preco) {
        this.id = contadorProduto;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        contadorProduto++;
    }

    public Float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
