//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcao = 3;
        double num1 = 10;
        double num2 = 4;

        double resultado = switch (opcao) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> {
                System.out.println("Opção inválida!");
                yield 0;
            }
        };

        System.out.println("Resultado: " + resultado);
    }
}