import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            Simple obj = new Simple();
            obj.setNum(num);
            obj.simple();
        }
    }
}
