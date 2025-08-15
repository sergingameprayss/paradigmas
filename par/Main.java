
import java.util.Scanner;

public class Main {
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println("o numero " + numero + " é par? " + Par.main(args, numero));
        sc.close();
    }
}
