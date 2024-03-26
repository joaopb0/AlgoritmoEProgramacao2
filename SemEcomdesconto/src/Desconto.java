public class Desconto {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o valor do produto");
        Double Valor = teclado.leDouble();

        System.out.println("Insira a quantidade do produto");
        Double Quantidade = teclado.leDouble();

        Double Sem = Valor * Quantidade;

        Double Com = Sem * 0.90;

        System.out.println("Valor com desconto");
        System.out.println(Com);

        System.out.println("Valor sem desconto");
        System.out.println(Sem);

    }
}
