import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Peso dos Peixes em Kg: ");
        double pesokg = input.nextDouble();
        double excesso = pesokg - 50;
        double multa = 0.0;
        if (pesokg > 50) {
          multa = excesso * 4.0;
          System.out.println("Peso Excedente: " + excesso);
          System.out.println("Valor da Multa a Pagar R$" + multa);
        }
        else {
            System.out.println("Não houve excesso de peso");
        }
    }
}
