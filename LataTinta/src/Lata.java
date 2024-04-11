public class Lata {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o comprimento do muro");
        double Comprimento = teclado.leDouble();

        System.out.println("Insira a altura do muro");
        double Altura = teclado.leDouble();

        double calculoQuadrado = Comprimento * Altura;

        double Litros = calculoQuadrado / 3;

        double latasNecessarias = Litros / 5;

        double dinheiroNecessario = latasNecessarias * 61;

        System.out.println("A quantidade de latas de tintas é:");
        System.out.println(latasNecessarias);

        System.out.println("A quantidade necessária de dinheiro é:");
        System.out.println(dinheiroNecessario);

    }
}
