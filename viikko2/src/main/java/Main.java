import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplier three = new Multiplier(3);
        System.out.println("Type a number ");
        int number = scanner.nextInt();

        System.out.println("number multiplied by three is " + three.multipliedBy(number));
    }
}