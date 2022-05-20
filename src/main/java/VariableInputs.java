
import java.util.Scanner;

public class VariableInputs {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text");
        String text = scanner.nextLine();
        System.out.println("Enter an integer");
        Integer num = scanner.nextInt();
        System.out.println("Enter a double");
        Double dub = scanner.nextDouble();
        System.out.println("Enter a boolean value");
        Boolean boo = scanner.nextBoolean();

        yourStringIs(text);
        yourIntIs(num);
        yourDoubleIs(dub);
        yourBooleanIs(boo);
    }

    public static String yourStringIs(String text){
        return "Your string is " + text;
    }
    public static String yourIntIs(int num){
        return "Your number is " + num;
    }
    public static String yourDoubleIs(double dub){
        return "Your double is " + dub;
    }
    public static String yourBooleanIs(boolean boo){
        return "Your boolean is " + boo;
    }







}