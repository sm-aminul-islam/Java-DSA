import java.util.Arrays;
public class PairsTwoSum {
    public static void main(String[] args) {
        PairsTwoSum pt=new PairsTwoSum();
        int [] array={2,7,13,9};
        int []result=pt.twoSum(array,20);
        System.out.println(Arrays.toString(result));

    }
    //two sum
    public  int[]twoSum(int []nums,int target){
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                     return new int[]{i , j};
                 }
             }
         }
    throw new IllegalArgumentException("NO solution found");
    }
}
