import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valorTotal;
        System.out.print("Digite o valor total de suas compras R$: ");
        valorTotal = sc.nextDouble();

        if (valorTotal > 1000){
            valorTotal = (1000 * 0.85);
            System.out.print("O valor final com desconto de 15% é : R$" + df.format(valorTotal));
        }
        else {
            valorTotal = (1000 * 0.92);
            System.out.print("O valor final com desconto de 8% é: R$" + df.format(valorTotal));
        }

    }
}
