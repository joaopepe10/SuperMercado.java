import java.util.ArrayList;
import java.util.List;

public class Item {

    //ATRIBUTOS DA CLASSE
    private float valorTotalProdutos;
    private float total;
    private List<Produto> produtos;

    //METODO CONSTRUTOR

    public Item() {

        this.valorTotalProdutos = 0;
        produtos = new ArrayList<>();
        this.total = 0;
    }
    public Item(List<Produto> produtos) {

        this.valorTotalProdutos = 0;
        this.produtos = produtos;
        this.total = 0;
    }

    //METODOS
    public void adcProdutoNaLista(Produto p, int q){
        this.produtos.add(p);

        for (Produto produto: produtos){
            if (p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())){
                produto.setPrecoProduto(produto.getPrecoProduto() + 0);

            }else {
                produto.setPrecoProduto(produto.getPrecoProduto() * q);
                System.out.println("NOME: " + produto.getNomeProduto() + " PRECO R$" + produto.getPrecoProduto());

            }
                    }
        System.out.println("PRODUTOS ADICIONADOS COM SUCESSO NA LISTA!");
    }
    public void adcCarrinhoQtnd(Produto p, int quant){
        float somaProdutos = 0;
        float totalFinal = 0;

        p.setQuantidadeProduto(quant);
        boolean existe = false;
        for (Produto produto : produtos) {
            if(produto.equals(p)){
                existe = true;
                produto.setQuantidadeProduto(produto.getQuantidadeProduto() * quant);
                break;
            }
        }
        if (! existe){

            p.setQuantidadeProduto(quant);
            this.produtos.add(p);
            System.out.println("====>ADICIONANDO ITEM \nProduto " + p.getNomeProduto()+" adicionado ao carrinho "+"x"+p.getQuantidadeProduto()+" unidades R$"+ (p.getPrecoProduto() * p.getQuantidadeProduto()));
        }
        for (Produto produto: produtos){
            somaProdutos = produto.getPrecoProduto() * produto.getQuantidadeProduto();
            totalFinal += somaProdutos;
            this.total = totalFinal;
           /* System.out.println("Nome: "+p.getNomeProduto() +
                    " COD[ "+p.getCodProduto() +
                    " ] UN: " +quant +
                    " PRECO: " +p.getPrecoProduto() +
                    " TOTAL: " + somaProdutos);*/
        }
    }
     public  void somaTotal(){
         System.out.println("\n=====>CALCULANDO FATURA\n");
        for(Produto p: produtos){

            System.out.println("Nome: "+p.getNomeProduto() +
                    " COD[ "+p.getCodProduto() +
                    " ] UN: " + p.getQuantidadeProduto() +
                    " PRECO: " +p.getPrecoProduto() +
                    " TOTAL: " + (p.getQuantidadeProduto() * p.getPrecoProduto()));
        }
         System.out.println("\t\t\t\t\t\t====> TOTAL DAS COMPRAS: R$" + this.total );
    }

    //METODOS GETTER AND SETTER

    public float getTotal() {
        return total;
    }


    public float getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(float valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
