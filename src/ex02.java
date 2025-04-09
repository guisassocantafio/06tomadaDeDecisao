import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double prova1, prova2, trabalho1, trabalho2, trabalho3, media;

        System.out.print("Digite a nota da primeira prova -> ");
        prova1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova -> ");
        prova2 = sc.nextDouble();
        System.out.print("Digite a nota do primeiro trabalho -> ");
        trabalho1 = sc.nextDouble();
        System.out.print("Digite a nota do segundo trabalho -> ");
        trabalho2 = sc.nextDouble();
        System.out.print("Digite a nota do terceiro trabalho -> ");
        trabalho3 = sc.nextDouble();

        media = (((prova1+prova2)/2)*0.7) + (((trabalho1+trabalho2+trabalho3)/3)*0.3);

        if (media <=6){
            System.out.println("Você está reprovado, sua média foi -> " + df.format(media));
        }
        else {
            System.out.println("Você está aprovado, sua média foi -> " + df.format(media));
        }
    }
}
