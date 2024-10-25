import java.util.Scanner;

public class contadorDeVogais {
    public static void main(String[] args) {
        String palavra;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma palavra");
        palavra = scan.nextLine();
        System.out.println("a palavra tem : " + contador(palavra) + " vogais");
    }
    public static double contador(String palavra){
        String vogais = "aeiouAIOU";
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if(vogais.indexOf(letra) != -1){
                contador++;
            }
        }
        return contador;
    }
}

