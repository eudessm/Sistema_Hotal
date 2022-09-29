package Dados;

public class vProdutos {
    private int idProduto;
    private String nome;
    private String descricao;
    private String unidade_medida;
    private double valor_produto;
       
    public vProdutos(){}
    public vProdutos(int idProduto, String nome, String descricao, String unidade_medida, double valor_produto){
    this.idProduto=idProduto;
    this.nome=nome;
    this.descricao=descricao;
    this.unidade_medida=unidade_medida;
    this.valor_produto=valor_produto;    
    }

    public int getIdProduto() {
        return idProduto;
    }
   
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
  
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    public String getUnidade_medida() {
        return unidade_medida;
    }
 
    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

}
