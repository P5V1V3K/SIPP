import java.util.Scanner;
public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        float v = (22f/7f)*r*r*h;
        System.out.println(v);
    }
}
