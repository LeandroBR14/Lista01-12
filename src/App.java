import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        double pesoideal = (72.7*altura) - 58;
        System.out.printf("Seu peso ideal é de: %.2f kg", pesoideal);

        teclado.close();
    }
}
