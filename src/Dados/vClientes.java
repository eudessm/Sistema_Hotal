package Dados;

public class vClientes extends vPessoas {

    private String codigo_cliente;

    public vClientes() {
    }

    public vClientes(String codigo_cliente, int id_pessoa, String nome, String nome_pai, String nome_mae, String tipo_documento, String num_documento, String endereco, String telefone, String email) {
        super(id_pessoa, nome, nome_pai, nome_mae, tipo_documento, num_documento, endereco, telefone, email);
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

}
