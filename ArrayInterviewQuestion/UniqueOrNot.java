public class Unique {
    public static void main(String[] args) {
        Unique ui=new Unique();
        int array[]={1,2,3,4,3,6};
        boolean result=ui.isUnique(array);
        System.out.println(result);
    }
    public  boolean isUnique(int []array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
