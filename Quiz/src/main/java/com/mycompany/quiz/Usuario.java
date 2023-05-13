class Usuario {

    // atributos
    private String user, password;

    public void criarCadastro(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void lerCadastro(String user, String password) {
        System.out.println("O seu usuario e senha é: " + user + password);
    }

    public void efetuarLogin(String user, String password) {
        System.out.println("Digite seu usuario e senha: ");
    }

    // getters
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    // setters
    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getPassword(String senha1) {
        return false;
    }
}