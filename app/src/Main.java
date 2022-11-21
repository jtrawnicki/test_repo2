import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        while (true) {
            System.out.println("Podaj liczbę do podania pierwiastka: ");
            int liczba = scanner.nextInt();
            System.out.println(Math.sqrt((double) liczba));
        }
    }
}