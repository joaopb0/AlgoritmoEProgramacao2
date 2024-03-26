public class Temperatura {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira os graus Celsius");
        Double Celsius = teclado.leDouble();

        Double Kelvin = Celsius + 273.15;

        Double Farenheit = (Celsius * 9/5) + 32;

        System.out.println("Temperatura em Kelvin");
        System.out.println(Kelvin);

        System.out.println("Temperatura em Farenheit");
        System.out.println(Farenheit);

    }
}
