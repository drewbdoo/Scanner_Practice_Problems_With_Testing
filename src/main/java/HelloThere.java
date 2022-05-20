
import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
    }

}