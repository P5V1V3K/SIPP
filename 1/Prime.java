import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
    public static boolean prime(int n){
        if(n<2)return false;
        for(int i=2;i<=n/2;++i){
            if(n%i==0)return false;
        }
        return true;
    }
}
