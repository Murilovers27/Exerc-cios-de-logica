import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero");
        double numero = scan.nextDouble();
        if(numero % 2 == 0){
            System.out.println("numero par");
        }else{
            System.out.println("numero impar");
        }
    }
}
