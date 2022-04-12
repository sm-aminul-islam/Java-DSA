package dsaandalgo;

import java.util.Scanner;

/**
 *\
 * Find majority element of an array using Boyer-Moore majority voting Algorithm it is only use when array size/2 is less than majority element count//
 * @author devil
 */
public class DsaAndAlgo {

    static int MajorityElement(int arr[]) {
        int count=0,ansIndex=-1;
        
       for(int i=0;i<arr.length;i++){
           if(count==0){
           ansIndex=arr[i];
           count=1;
       }
           else{
               if(arr[i]==ansIndex){
                   count++;
               }
               else{
                   count--;
               }
           }
       }
       count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==ansIndex){
               count++;
           }
       }
       if(count>(arr.length/2)){
           return ansIndex;
       }
       else{
           return -1;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MajorityElement(arr));
    }
}
