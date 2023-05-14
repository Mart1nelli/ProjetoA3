public class UsuarioComum extends Usuario {
    private String resultado;
    private String resposta;

    public UsuarioComum(String string, String string1) {
        
    }

    public void responderQuestao(String resposta) {
        System.out.println("Sua resposta é: " + resposta);
    }

    public void verResultado(String resultado) {
        System.out.println("O resultado é: " + resultado);
    }
}
