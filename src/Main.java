import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CRIANDO PRODUTOS
        Produto produto1 = new Produto("Cafe",2375, (float) 23.5f);
        Produto produto2 = new Produto("Acucar",2376, (float) 12.33f);
        Produto produto3 = new Produto("Arroz",2377, (float) 29.75f);

        //ADCIONANDO PRODUTO A LISTA PRODUTOS

        Item carrinho = new Item();

        //METODO PARA ADICIONAR ITENS NO CARRINHO
        carrinho.adcCarrinhoQtnd(produto1, 10);
        carrinho.adcCarrinhoQtnd(produto2, 10);
        carrinho.adcCarrinhoQtnd(produto3, 10);

        //FATURA DOS PRODUTOS
        carrinho.somaTotal();




    }
}