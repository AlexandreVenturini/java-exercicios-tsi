//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 10;

        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        String conceito;

        if (media >= 9.0) {
            conceito = "Excelente";
        } else if (media >= 7.0) {
            conceito = "Bom";
        } else if (media >= 5.0) {
            conceito = "Regular";
        } else {
            conceito = "Insuficiente";
        }

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
    }
}