package processo;

import entidade.Produto;

import java.util.ArrayList;

public class Carrinho {
    private static Integer contadorId = 1;
    private Integer id;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private Integer quantidadeItens;
    private Float valorTotal;

    public Carrinho() {
        this.id = contadorId;
        this.valorTotal = 0f;
        this.quantidadeItens = 0;
        contadorId++;
    }

    public void calculaTotalValorQuantidade(){
        listaProdutos.forEach(a -> setValorTotal(a.getPreco() + getValorTotal()));
        setQuantidadeItens(listaProdutos.size());
    }

    public void adicionaProduto(Produto produto, Integer quantidade){
        for(int i = 0; quantidade > i; i++) {
            listaProdutos.add(produto);
        }
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "listaProdutos=" + listaProdutos +
                ", quantidadeItens=" + quantidadeItens +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
