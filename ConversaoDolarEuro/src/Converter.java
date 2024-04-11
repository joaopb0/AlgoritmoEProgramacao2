public class Converter {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira um valor para converter para Dolar e Euro");

        double Real = teclado.leDouble();

        double valorDolar = Real / 5.07;

        double valorEuro = Real / 5.44;

        System.out.println("Cotação do Dolar: 5,07");

        System.out.println("Cotação do Euro: 5,44");

        System.out.println("O valor equivale a: " + valorDolar + " Dolares");

        System.out.println("O valor equivale a: " + valorEuro + " Euros");

        

    }
}
