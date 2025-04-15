import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite um valor --> ");
        lado1 = sc.nextDouble();
        System.out.print("Digite outro valor --> ");
        lado2 = sc.nextDouble();
        System.out.print("Digite outro valor --> ");
        lado3 = sc.nextDouble();

        if (lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2){
            System.out.println("Os valores representam os lados de um triângulo");
        }
        else {
            System.out.println("Os valores não representam os lados de um triângulo");
        }
    }
}
