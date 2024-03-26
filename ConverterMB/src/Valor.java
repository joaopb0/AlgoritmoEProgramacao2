public class Valor {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira um valor em megabytes para converter");
        Double Megabyte = teclado.leDouble();

        Double Bits = Megabyte * 8e+6;

        Double Byte = Megabyte * 1e+6;

        Double Quilobyte = Megabyte * 1000;

        Double Gigabyte = Megabyte / 1000;

        Double Terabyte = Megabyte / 1e+6;

        Double Petabyte = Megabyte / 1e+9;

        System.out.println("Megabytes em Bits");
        System.out.println(Bits);

        System.out.println("Megabytes em Bytes");
        System.out.println(Byte);

        System.out.println("Megabytes em Quilobytes");
        System.out.println(Quilobyte);

        System.out.println("Megabytes em Gigabytes");
        System.out.println(Gigabyte);

        System.out.println("Megabytes em Terabytes");
        System.out.println(Terabyte);

        System.out.println("Megabytes em Petabytes");
        System.out.println(Petabyte);

    }
    
}