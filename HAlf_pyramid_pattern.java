import java.util.Scanner;

//Half Pyramid
public class Learning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++) {
            System.out.print("*");

        }
        System.out.println();
    }
    }
}
