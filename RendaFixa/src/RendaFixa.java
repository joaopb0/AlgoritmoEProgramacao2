public class RendaFixa {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o valor investido");
        Double Valor = teclado.leDouble();

        System.out.println("Insira a porcentagem de rendimento ao ano (Ex: 0.2 = 2%)");
        Double Porcentagem = teclado.leDouble();

        System.out.println("Insira o tempo investido em anos");
        Double Tempo = teclado.leDouble();

        Double Rendimento = Valor * Porcentagem * Tempo;

        System.out.println("Previsão de rendimento");
        System.out.println(Rendimento);

    }
}
