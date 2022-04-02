import java.util.Scanner;

public class Josephus {
    static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        return (jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        System.out.println(jos(n,k));

    }

}
