import java.util.Scanner;
//palindrome Number
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=0,temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(sum);
        }
        else {
            System.out.println("Not Possible");
        }
    }
}
