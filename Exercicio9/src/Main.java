//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palavra = "pneumoultramicroscopicossilicovulcanoconiótico";
        int contador = 0;

        for (char letra : palavra.toCharArray()) {
            char letraMinuscula = Character.toLowerCase(letra);

            if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
                contador++;
            }
        }

        System.out.println("Saída: " + contador + " vogais");
    }
}