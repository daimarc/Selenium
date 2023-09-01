import java.util.Scanner;

public class somanumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeironum = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundonum = scanner.nextInt();
        int resultado = primeironum + segundonum;
        System.out.println("O resultado é: "+ resultado);
        scanner.close();
    }
}
