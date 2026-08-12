//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
                case 1 -> {
                    System.out.println("--- Produtos cadastrados ---");
                    for (String produto : produtos) {
                        if (produto != null) {
                            System.out.println("- " + produto);
                        }
                    }
                }
                case 2 -> {
                    if (posicaoLivre < produtos.length) {
                        produtos[posicaoLivre] = nomesParaAdicionar[indiceNomeAtual];
                        System.out.println("Produto adicionado: " + nomesParaAdicionar[indiceNomeAtual]);
                        posicaoLivre++;
                        indiceNomeAtual++;
                    } else {
                        System.out.println("Estoque cheio! Não é possível adicionar.");
                    }
                }
                case 3 -> {
                    int contador = 0;
                    for (String produto : produtos) {
                        if (produto != null) {
                            contador++;
                        }
                    }
                    System.out.println("Produtos cadastrados: " + contador);
                }
                case 4 -> {
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}