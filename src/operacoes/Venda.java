package operacoes;

import processo.Pedido;

import java.time.LocalDateTime;

public class Venda {
    private static Integer contadorId = 1;
    private Integer id;
    private LocalDateTime dataDaVenda;
    private Pedido pedido;

    public Venda(Pedido pedido) {
        this.id = contadorId;
        this.dataDaVenda = LocalDateTime.now();
        this.pedido = pedido;
        contadorId++;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", dataDaVenda=" + dataDaVenda +
                ", vendedor=" + pedido.getOrcamento().getFuncionario().getNome() +
                ", cliente=" + pedido.getOrcamento().getCliente().getNome() +
                ", desconto=" + String.format("%.2f", pedido.getDesconto()) +
                ", valor=" + String.format("%.2f", pedido.getValorFinal()) +
                '}';
    }
}
