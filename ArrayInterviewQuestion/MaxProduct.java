public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct mp=new MaxProduct();
        int []array={10,60,30,40,50};
        String pairs=mp.maxProduct(array);
        System.out.println(pairs);
    }
     public  String maxProduct(int []array){
        int maxProduct=0;
        String pairs="";
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                 if(array[i]*array[j]>maxProduct){
                     maxProduct=array[i]*array[j];
                     pairs=Integer.toString(array[i])+","+Integer.toString(array[j]);
                 }
            }
        }
        return pairs;
     }
}
