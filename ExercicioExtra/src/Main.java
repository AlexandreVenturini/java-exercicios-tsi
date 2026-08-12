//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        double[][] notas = {
                {7.0, 8.0},
                {5.5, 6.0},
                {9.0, 10.0}
        };

        for (int aluno = 0; aluno < notas.length; aluno++) {
            double media = calcularMedia(notas[aluno][0], notas[aluno][1]);
            System.out.println("Aluno " + (aluno + 1) + " - Média: " + media);
        }

        String notaExtraDigitada = "8.5";

        try {
            double notaExtra = Double.parseDouble(notaExtraDigitada);
            double novaMedia = calcularMedia(notas[0][0], notaExtra);
            System.out.println("Nova média do Aluno 1: " + novaMedia);
        } catch (Exception e) {
            System.out.println("Erro: valor inválido digitado. Digite apenas números.");
        }
    }
}