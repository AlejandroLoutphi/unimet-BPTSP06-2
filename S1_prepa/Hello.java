import java.util.Scanner;
/**
 *Le documentacion
 *@author Alejandro Loutphi
 */

public class Hello {
    public static int input_int() {
        Scanner scanner;
        String inp;
        int o = 0;

        while (true) {
            try {
                scanner = new Scanner(System.in);
                inp = scanner.toString();
                o = Integer.parseInt(inp);
            } catch(Exception e) {
                System.out.println("Inserte un número válido.");
                continue;
            }
            scanner.close();
            return o;
        }
    }
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }

        String hello = "Edad:";
        //int age = 17;
        char ch = 'a';
        int parsedAge = Hello.input_int();
        System.out.println(hello + " " + Integer.toString(parsedAge) + Character.toString(ch));
    }
}
