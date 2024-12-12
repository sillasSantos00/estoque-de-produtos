public class test {
    private static String Produtos;

    public static void main(String[] args) {
        System.out.println("          ESTOQUE DE PRODUTOS ");
        System.out.println("------------------------------------------ ");
        Produtos meuestoque = new Produtos(15, " ARROZ  ",26);
        System.out.println("          nome do produto: " + meuestoque.getNome());
        System.out.println("          quantidade: " + meuestoque.getQuantidade());
        System.out.println("          PRECO UNITARIO: " + meuestoque.getValor());
    }
}
