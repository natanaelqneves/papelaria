package entidade;

public class Fornecedor extends Pessoa{
    private String CNPJ;

    public Fornecedor(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public String toString() {
        return "Fornecedor {" +
                "id=" + getId() +
                ", CNPJ=" + getCNPJ() +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
