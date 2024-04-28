public class Mercado {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o valor unitário do produto 1:");
        double Prod1 = teclado.leDouble();
        System.out.println("Insira a quantidade de produtos:");
        double Quant1 = teclado.leDouble();

        System.out.println("Insira o valor unitário do produto 2:");
        double Prod2 = teclado.leDouble();
        System.out.println("Insira a quantidade de produtos:");
        double Quant2 = teclado.leDouble();

        System.out.println("Insira o valor unitário do produto 3:");
        double Prod3 = teclado.leDouble();
        System.out.println("Insira a quantidade de produtos:");
        double Quant3 = teclado.leDouble();

        System.out.println("Insira o valor unitário do produto 4:");
        double Prod4 = teclado.leDouble();
        System.out.println("Insira a quantidade de produtos:");
        double Quant4 = teclado.leDouble();

        System.out.println("Insira o valor unitário do produto 5:");
        double Prod5 = teclado.leDouble();
        System.out.println("Insira a quantidade de produtos:");
        double Quant5 = teclado.leDouble();

        double Valor1 = Prod1 * Quant1;

        double Valor2 = Prod2 * Quant2;

        double Valor3 = Prod3 * Quant3;

        double Valor4 = Prod4 * Quant4;

        double Valor5 = Prod5 * Quant5;

        double semDesconto = Valor1 + Valor2 + Valor3 + Valor4 + Valor5;
        double comDesconto = semDesconto * 0.87;

        System.out.println("Insira o valor pago pelo cliente:");
        double Troco = teclado.leDouble();

        double trocoSemDesconto = Troco - semDesconto;
        double trocoComDesconto = Troco - comDesconto;

        System.out.println("Valor do(s) produto(s) 1: " + Valor1);

        System.out.println("Valor do(s) produto(s) 2: " + Valor2);

        System.out.println("Valor do(s) produto(s) 3: " + Valor3);

        System.out.println("Valor do(s) produto(s) 4: " + Valor4);

        System.out.println("Valor do(s) produto(s) 5: " + Valor5);

        System.out.println("Valor total dos produtos sem desconto: " +semDesconto);

        System.out.println("Valor total dos produtos com desconto " + comDesconto);

        System.out.println("Valor do troco com o desconto: " + trocoComDesconto);

        System.out.println("Valor do troco sem desconto: " + trocoSemDesconto);

    }
}
