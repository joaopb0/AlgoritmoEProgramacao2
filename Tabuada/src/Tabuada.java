public class Tabuada {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira um numero para calcular a sua tabuada do 10");
        int Calculo = teclado.leInt();

        int t1 = Calculo * 1;
        int t2 = Calculo * 2;
        int t3 = Calculo * 3;
        int t4 = Calculo * 4;
        int t5 = Calculo * 5;
        int t6 = Calculo * 6;
        int t7 = Calculo * 7;
        int t8 = Calculo * 8;
        int t9 = Calculo * 9;
        int t10 = Calculo * 10;

        System.out.println("Resultado da tabuada até o 10:");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);
        System.out.println(t10);

    }
}
