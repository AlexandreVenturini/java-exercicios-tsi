//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            String resultado = "";

            if (i % 3 == 0) {
                resultado += "Fizz";
            }
            if (i % 5 == 0) {
                resultado += "Buzz";
            }
            if (i % 7 == 0) {
                resultado += "Bazz";
            }

            if (resultado.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(resultado);
            }
        }
    }
}