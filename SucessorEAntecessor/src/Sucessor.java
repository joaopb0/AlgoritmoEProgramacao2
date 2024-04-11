public class Sucessor {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira um numero para exibir o seu sucessor e antecessor");
        int Numero = teclado.leInt();

        int Antecessor = Numero - 1;
        int Sucessor = Numero + 1;

        System.out.println("O numero antecessor é:");
        System.out.println(Antecessor);

        System.out.println("O numero sucessor é:");
        System.out.println(Sucessor);

    }
}
