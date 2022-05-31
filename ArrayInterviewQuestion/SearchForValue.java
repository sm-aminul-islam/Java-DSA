import java.util.Scanner;

public class SearchForaValue {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        SearchForaValue sc=new SearchForaValue();
        int array[]=new int[10];
        for(int i=0;i<5;i++){
            array[i]=ac.nextInt();
        }
        sc.linearSearch(array,40);

    }
    public void linearSearch(int[]array,int value){
         for(int i=0;i<array.length;i++){
             if(array[i]==value){
                 System.out.println("The value is "+i);
                 return;
             }
         }
        System.out.println(value+" is not found");
    }
}
