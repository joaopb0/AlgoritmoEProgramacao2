public class Aumento3 {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o seu salario base para calcular o bonus de 3%");
        Double salarioBase = teclado.leDouble();

        System.out.println("Insira o seu tempo de serviço para calcular");
        Double tempoServico = teclado.leDouble();

        Double bonus = salarioBase + (salarioBase * (tempoServico * 0.03));

        System.out.println("O valor do seu salario é:");
        System.out.println(bonus);

    }
}
