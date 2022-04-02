import java.util.Scanner;

public class MatrixPaths {
    static  int count(int n,int m){
        if(n==1||m==1){
            return 1;
        }
        return count(n-1,m)+count(n,m-1);
    }

    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(count(m,n));

    }
}