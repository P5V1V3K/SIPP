import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=(a+b+c)/3f;
        System.out.println(avg);
    }
}
