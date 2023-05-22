/*import java.util.Scanner;

public class CadastroLoginSenha {

    public static void main(String[] args) {

        Usuario p1 = new Usuario();
        UsuarioComum p2 = new UsuarioComum();
        Administrador p3 = new Administrador();

        Scanner input = new Scanner(System.in);

        Usuario[] usuarios = new Usuario[2];

        usuarios[0] = new UsuarioComum("User123", "123456");
        usuarios[1] = new Administrador("User123", "123456");

        System.out.println("Usuario: ");
        String usuario1 = input.nextLine();

        System.out.println("Senha: ");
        String senha1 = input.nextLine();

        Boolean encontrado = false;

        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(usuario) && usuario.getPassword(senha)) {
                encontrado = true;
                if (usuario instanceof Administrador) {
                    System.out.println("Bem vindo, Administrador" + usuario.getUser() + "!");
                } else {
                    System.out.println("Bem vindo, usuario comum" + usuario.getUser() + "!");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuario ou senha Invalidos!");
        }
    }
}