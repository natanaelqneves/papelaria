import entidade.*;
import entidade.enuns.FormaDePagamento;
import operacoes.Venda;
import plataforma.Carrinho;
import plataforma.Orcamento;
import plataforma.Pedido;

public class Principal {
    public static void main(String[] args) {

        //PESSOAS ENVOLVIDAS NAS RELAÇÕES DE COMERCIO
        Funcionario kinho = new Funcionario("Kinho", "Av Cabral", "8333334444", "45678912312","Fiscal", 2660L);
        Funcionario amora = new Funcionario("Amora", "Av Cabral", "8333334444", "12345612358","Fiscal", 4660L);
        Cliente renan = new Cliente("Renan", "Av Brasil", "8332031548", "45678978998");
        Cliente jobex = new Cliente("Jobex", "Av Argentina", "8399558844", "14785236987");
        //assessors.forEach(a -> System.out.println(a.toString()));

        //PRODUTOS INSTANCIADOS
        Produto caneta = new Produto("12afg", "Caneta Preta", "Caneta Esferográfica de cor Preta", 1.50f);
        Produto estojo = new Produto("33ahh", "Estojo de Lapis", "Estojo de couro para lapis e canetas", 7.50f);
        Produto borracha = new Produto("243kj", "Borracha Universal", "Borracha apaga tudo", 2.20f);

        //CARRINHO DE COMPRAS
        Carrinho carrinho1 = new Carrinho();
        Carrinho carrinho2 = new Carrinho();
        carrinho1.adicionaProduto(caneta, 31);
        carrinho1.adicionaProduto(estojo, 54);
        carrinho2.adicionaProduto(caneta, 20);
        carrinho2.adicionaProduto(borracha, 30);
        carrinho1.calculaTotalValorQuantidade();
        carrinho2.calculaTotalValorQuantidade();

        //ORÇAMENTO SOLICITADO
        Orcamento orcamentoDeRenan = new Orcamento(carrinho1, renan, amora);
        Orcamento orcamentoDeKinho = new Orcamento(carrinho2, jobex, kinho);

        //FINALIZANDO PEDIDOS
        Pedido pedido1 = new Pedido(orcamentoDeKinho, FormaDePagamento.DEBITO);
        Pedido pedido2 = new Pedido(orcamentoDeRenan, FormaDePagamento.PIX);

        //VENDA REALIZADA
        Venda venda = new Venda(pedido1);

        System.out.println(venda.toString());
        }
}