import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        if(numero % 2 == 0){ // a % significa o resto da divisão
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é ímpar");
        }
        scanner.close();
    }
}
