package Dados;


public class vclientes extends vpessoas {

    private String codigo_cliente;

    public vclientes() {
    }

    public vclientes(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

}
