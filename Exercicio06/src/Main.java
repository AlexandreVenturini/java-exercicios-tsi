public class Main {
    public static void main(String[] args) {
        Integer idade = 25;

        String classificacao = switch (idade) {
            case Integer i when i <= 12 -> "Criança";
            case Integer i when i <= 17 -> "Adolescente";
            case Integer i when i <= 59 -> "Adulto";
            default -> "Idoso";
        };

        System.out.println("Classificação: " + classificacao);
    }
}