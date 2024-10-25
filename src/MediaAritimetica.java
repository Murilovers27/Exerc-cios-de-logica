import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1, numero2, numero3, media = 0;
        System.out.println("primeiro numero: ");
        numero1 = scan.nextDouble();
        System.out.println("segundo numero: ");
        numero2 = scan.nextDouble();
        System.out.println("terceiro numero: ");
        numero3 = scan.nextDouble();
        media = (numero1 + numero2 + numero3)  / 3;
        System.out.println("sua media e de: " + media);
    }
}
