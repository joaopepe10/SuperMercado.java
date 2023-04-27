public class Produto {
    private String nomeProduto;
    private int quantidadeProduto;
    private int codProduto;
    private float precoProduto;

    public Produto(){
        this.nomeProduto = getNomeProduto();
        this.codProduto = getCodProduto();
        this.precoProduto = getPrecoProduto();
        this.quantidadeProduto = 0;
    }
    public Produto(String nomeProduto, int codProduto, float precoProduto) {
        this.nomeProduto = nomeProduto;
        this.codProduto = codProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = 0;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}

