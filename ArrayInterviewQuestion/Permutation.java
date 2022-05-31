public class ArrayPermutation {
    public static void main(String[] args) {
        ArrayPermutation ap=new ArrayPermutation();
        int []array1={1,2,3,4,5};
        int []array2={5,4,3,2,1};
        boolean result=ap.permutation(array1,array2);
        System.out.println(result);

    }
    //permutation
    public boolean permutation(int []array1,int []array2){
        if(array1.length!=array2.length){
            return false;
        }
        int sum1=0,sum2=0;
        int mul1=1,mul2=1;
        for(int i=0;i<array1.length;i++){
            sum1+=array1[i];
            sum2+=array2[i];
            mul1*=array1[i];
            mul2*=array2[i];
        }
        if(sum1==sum2 && mul1==mul2){
            return true;
        }
        return false;
    }

}
