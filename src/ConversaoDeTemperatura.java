import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celcius;
        System.out.println("digite a temperatura");
        celcius = scan.nextDouble();
        conversao(celcius);
    }
    public static void conversao(double celcius){
        double  fahrenheit = ((celcius * 1.8) + 32);
        System.out.println("a conversão e de: " + fahrenheit + " F");
    }
}
