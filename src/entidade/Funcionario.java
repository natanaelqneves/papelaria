package entidade;

public class Funcionario extends Pessoa{
    private String CPF;
    private String cargo;
    private Long salario;

    public Funcionario(String nome, String endereco, String telefone, String CPF, String cargo, Long salario) {
        super(nome, endereco, telefone);
        this.CPF = CPF;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id=" + getId() +
                ", CPF=" + getCPF() +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
