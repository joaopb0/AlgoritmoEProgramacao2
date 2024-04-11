public class Login {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira seu nome");

        String nome = teclado.leString();

        System.out.println("Insira o seu E-mail");

        String email = teclado.leString();

        System.out.println("O usuario " + nome + " " + "(" + email + ")" + " entrou no sistema.");

    }
}
