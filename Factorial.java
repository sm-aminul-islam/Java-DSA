import java.util.Scanner;
//Factorial of number

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println(result);
    }

}
