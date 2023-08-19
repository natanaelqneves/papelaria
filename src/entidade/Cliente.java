package entidade;

public class Cliente extends Pessoa{
    private String CPF;

    public Cliente(String nome, String endereco, String telefone, String CPF) {
        super(nome, endereco, telefone);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id=" + getId() +
                ", CPF=" + getCPF() +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
