public class Salario {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o valor do salário para um aumento de 15%");
        Double Aumento = teclado.leDouble();

        Double Soma = Aumento * 0.15;

        Double ValorNovo = Aumento + Soma;

        System.out.println("Valor do novo salário");
        System.out.println(ValorNovo);

    }
}
