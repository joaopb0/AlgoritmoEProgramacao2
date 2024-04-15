public class Caixa {
public static void main(String[] args) {
    
    Teclado teclado = new Teclado();

    int Nota200 = 200;
    int Nota100 = 100;
    int Nota50 = 50;
    int Nota20 = 20;
    int Nota10 = 10;
    int Nota5 = 5;
    int Nota2 = 2;
    int Nota1 = 1;

    System.out.println("Digite o valor que você deseja sacar");
    int Saque = teclado.leInt();

    int Quantidade200 = Saque / Nota200;
    Saque %= 200;

    int Quantidade100 = Saque / Nota100;
    Saque %= 100;

    int Quantidade50 = Saque / Nota50;
    Saque %= 50;

    int Quantidade20 = Saque / Nota20;
    Saque %= 20;

    int Quantidade10 = Saque / Nota10;
    Saque %= 10;

    int Quantidade5 = Saque / Nota5;
    Saque %= 5;

    int Quantidade2 = Saque / Nota2;
    Saque %= 2;

    int Quantidade1 = Saque / Nota1;
    Saque %= 1;

    System.out.println("Notas de 200: " + Quantidade200);
    System.out.println("Notas de 100: " + Quantidade100);
    System.out.println("Notas de 50: " + Quantidade50);
    System.out.println("Notas de 20: " + Quantidade20);
    System.out.println("Notas de 10: " + Quantidade10);
    System.out.println("Notas de 5: " + Quantidade5);
    System.out.println("Notas de 2: " + Quantidade2);
    System.out.println("Notas de 1: " + Quantidade1);

}
    
}