public class Comum extends Usuario {
    
    private int pontuacao;
    private char alternativaUsuario;

    //construtor
    public Comum(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    //metodos
    public void atualizarPontuacao() {

    }
    
    public void selecionarAlternativa() {

    }

    //Getters
    public int getPontuacao() {
        return pontuacao;
    }

    public char getAlternativa() {
        return alternativaUsuario;
    }

}
