import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Inserisci una lettera : ");
            input = scanner.next().charAt(0);
        } while (input != 'q');
    }
}