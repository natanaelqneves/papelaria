package entidade;

public abstract class Pessoa {
    private static Integer contadorCliente = 1;
    private static Integer contadorFornecedor = 1;
    private static Integer contadorFuncionario = 1;

    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;
    public Pessoa() {
    }
    public Pessoa(String nome, String endereco, String telefone) {
        if(this.getClass() == Cliente.class){
            this.id = contadorCliente;
            contadorCliente++;
        } else if( this.getClass() == Fornecedor.class) {
            this.id = contadorFornecedor;
            contadorFornecedor++;
        } else {
            this.id = contadorFuncionario;
            contadorFuncionario++;
        }
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }


}