public class Conversao {
    public static void main(String[] args) {

        Teclado teclado = new Teclado();
        
        System.out.println("Insira a quantidade de horas para converter:");

        double Horas = teclado.leDouble();

        double Dias = Horas / 24;

        double Semanas = Dias / 7;

        double Meses = Semanas / 4.345;

        double Anos = Meses / 12;

        System.out.println("Resultado das Horas em:");

        System.out.println("Dias " + Dias);
        System.out.println("Semanas " + Semanas);
        System.out.println("Meses " + Meses);
        System.out.println("Anos " + Anos);

    }
}
