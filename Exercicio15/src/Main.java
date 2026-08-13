public class Main {
    public static void main(String[] args) {
        String[] produtos = new String[5];

        int[] escolhas = {2, 2, 1, 3, 4};
        String[] nomesParaAdicionar = {"Parafuso", "Martelo"};
        int indiceNomeAtual = 0;
        int posicaoLivre = 0;
        boolean continuar = true;
        int indiceEscolha = 0;

        while (continuar) {
            int opcao = escolhas[indiceEscolha];
            indiceEscolha++;

            switch (opcao) {
                case 1 -> listarProdutos(produtos);
                case 2 -> adicionarProduto(produtos, posicaoLivre, nomesParaAdicionar[indiceNomeAtual]);
                case 3 -> contarProdutos(produtos);
                case 4 -> continuar = false;
                default -> System.out.println("Opção inválida!");
            }

            if (opcao == 2) {
                posicaoLivre++;
                indiceNomeAtual++;
            }
        }

        System.out.println("Encerrando o programa...");
    }

    private static void listarProdutos(String[] produtos) {
        System.out.println("--- Produtos cadastrados ---");
        for (String produto : produtos) {
            if (produto != null) {
                System.out.println("- " + produto);
            }
        }
    }

    private static Boolean adicionarProduto(String[] produtos, int posicaoLivre, String nome) {
        if (posicaoLivre >= produtos.length) {
            System.out.println("Estoque cheio!");
            return Boolean.FALSE;
        }

        produtos[posicaoLivre] = nome;
        System.out.println("Produto adicionado: " + nome);
        return Boolean.TRUE;
    }

    private static void contarProdutos(String[] produtos) {
        int contador = 0;
        for (String produto : produtos) {
            if (produto != null) {
                contador++;
            }
        }
        System.out.println("Produtos cadastrados: " + contador);
    }
}