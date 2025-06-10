import java.util.Scanner;
public class CelsiusToFahreneit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        float f = (c*(9f/5f))+32;

        System.out.println(f);
    }
}
