import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();// Lista para armazenar os nomes dos produtos
        int opcao = 0;// Inicializar a variável 'opcao'

        while (opcao != 4) {
            System.out.println("\nMenu de Opções de Estoque:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Consultar itens");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto para adicionar: ");
                    String nomeProduto = scanner.nextLine();
                    produtos.add(nomeProduto);
                    System.out.println("Produto \"" + nomeProduto + "\" adicionado com sucesso.");
                    break;

                case 2:
                    System.out.println("digite o nome do produto pra remover");
                    String removprod = scanner.nextLine();
                    if (produtos.remove(removprod)) {
                        System.out.println("produto " + removprod + "  removido com sucesso");
                    } else {
                        System.out.println("produto nao encontrado");
                    }

                    break;
                case 3:
                    System.out.println("produtos no estoque");
                    if (produtos.isEmpty()){
                        System.out.println("nenhum encontrado");
                    }else{
                        System.out.println("-" + produtos);
                    }
                    break;

                case 4:
                    System.out.println("saindo do sistema");
                    break;
                default:
                    System.out.println( "opcao em valida tente novamente ");

            }
        }

        scanner.close();
    }
}