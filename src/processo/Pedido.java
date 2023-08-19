package processo;

import entidade.enuns.FormaDePagamento;

import java.time.LocalDateTime;

public class Pedido {
    private static Integer contadorId = 1;
    private Integer id;
    private Orcamento orcamento;
    private LocalDateTime dataDoPedido;
    private FormaDePagamento formaDePagamento;
    private Float desconto;
    private Float valorFinal;

    public Pedido(Orcamento orcamento, FormaDePagamento formaDePagamento) {
        this. id = contadorId;
        this.dataDoPedido = LocalDateTime.now();
        this.orcamento = orcamento;
        this.formaDePagamento = formaDePagamento;
        this.desconto = descontoOfertado();
        this.valorFinal = orcamento.getCarrinho().getValorTotal() - descontoOfertado();
        contadorId++;
    }

    private Float descontoOfertado() {
        if(formaDePagamento.equals(FormaDePagamento.DINHEIRO) || formaDePagamento.equals(FormaDePagamento.PIX)){
            return orcamento.getCarrinho().getValorTotal() * 0.25f;
        } else if (formaDePagamento.equals(FormaDePagamento.DEBITO)){
            return  orcamento.getCarrinho().getValorTotal() * 0.05f;
        } else {
            return 0f;
        }
    }

    public Float getDesconto() {
        return desconto;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", vendedor=" + orcamento.getFuncionario().getNome() +
                ", cliente=" + orcamento.getCliente().getNome() +
                ", dateTime=" + dataDoPedido +
                ", formaDePagamento=" + formaDePagamento +
                ", desconto=" + String.format("%.2f",desconto) +
                ", valorFinal=" + String.format("%.2f",valorFinal) +
                '}';
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
