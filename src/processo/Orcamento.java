package processo;

import entidade.Cliente;
import entidade.Funcionario;

public class Orcamento {
    private static Integer contadorId = 1;
    private Integer id;
    private Carrinho carrinho;
    private Cliente cliente;
    private Funcionario funcionario;

    public Orcamento(Carrinho carrinho, Cliente cliente, Funcionario funcionario) {
        this.id = contadorId;
        this.carrinho = carrinho;
        this.cliente = cliente;
        this.funcionario = funcionario;
        contadorId++;
    }

    public Integer getId() {
        return id;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "id=" + id +
                ", \n" + carrinho.toString() +
                ", \n" + cliente.toString() +
                ", \n" + funcionario.toString() +
                '}';
    }
}
