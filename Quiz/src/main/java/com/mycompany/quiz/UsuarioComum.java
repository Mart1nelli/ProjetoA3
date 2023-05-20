public class UsuarioComum extends Usuario {
    String resultado;
    String resposta;

    public void responderQuestao(String resposta) {
        System.out.println("Sua resposta é: " + resposta);
    }

    public void verResultado(String resultado) {
        System.out.println("O resultado é: " + resultado);
    }
}
