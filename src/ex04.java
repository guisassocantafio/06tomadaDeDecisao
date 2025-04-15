import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        double x, resultado;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor de X --> ");
        x = sc.nextDouble();

        if (x * x - 25 <= 0) {
            System.out.println("Erro: O valor dentro da raiz quadrada não pode ser negativo ou zero.");
        } else {
            resultado = 8 / Math.sqrt(x * x - 25);
            System.out.println("Para x = " + x + ", o valor da expressão y é: " +df.format(resultado));
        }
    }
}