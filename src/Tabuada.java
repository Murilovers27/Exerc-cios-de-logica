import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("digite um numero de sua preferencia");
        int numero = scan.nextInt();
        tabuada(numero);

    }
    public static void tabuada(int numero){
        for (int i = 0; i <= 10; i++) {
            System.out.println(" " + numero + " x" + " " + i + " ="  + "  " + numero * i);
            //e feio mas e pratico
        }
    }
}
