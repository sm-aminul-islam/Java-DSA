import java.util.Scanner;
//trailing zeros
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int result=0;
        for(int i=5;i<=n;i=i*5){
            result=result+(n/i);
        }
        System.out.println(result);
    }
}
