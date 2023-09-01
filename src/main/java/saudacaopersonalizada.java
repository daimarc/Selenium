import java.util.Scanner;

public class saudacaopersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner é uma classe do java que nos permite digitar coisas no Console e guardá-las em variáveis.
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, "+nome+"! Bem-vindo");
        scanner.close();
    }

}
