import java.util.Scanner;

public class mediadenotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double primeiranota = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundanota = scanner.nextDouble();
        double media = (primeiranota + segundanota) / 2;
        System.out.println("A media é:"+ media);
        scanner.close();
    }
}
