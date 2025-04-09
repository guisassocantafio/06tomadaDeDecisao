import java.text.DecimalFormat;
import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double nota1, nota2, media;


        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1+nota2)/2;
        System.out.println("Sua média é: " + df.format(media));

        if (media<6) {
            System.out.println("Você está reprovado!");
        }
        else {
            System.out.println("Você está aprovado!");
        }

    }
}