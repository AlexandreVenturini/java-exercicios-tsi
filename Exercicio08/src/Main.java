//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String usuarioCorreto = "alexandre";
        String senhaCorreta = "ale123";

        // Simulando tentativas (poderia ser Scanner pra digitar de verdade)
        String[] tentativasUsuario = {"alexandre", "luiz", "alexandre"};
        String[] tentativasSenha = {"ale000", "ale123", "ale123"};

        int tentativas = 0;
        boolean logado = false;

        while (tentativas < 3 && !logado) {
            String usuarioDigitado = tentativasUsuario[tentativas];
            String senhaDigitada = tentativasSenha[tentativas];

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                logado = true;
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tentativa " + (tentativas + 1) + " de 3.");
            }

            tentativas++;
        }
        
        if (!logado) {
            System.out.println("Tentativas esgotadas. Acesso bloqueado.");
        }
    }
}