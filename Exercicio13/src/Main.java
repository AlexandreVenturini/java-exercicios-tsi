//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valor = 385;
        int[] notas = {100, 50, 20, 10, 5, 2};

        for (int nota : notas) {
            int quantidade = valor / nota;

            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de " + nota);
            }

            valor = valor % nota;
        }
    }
}