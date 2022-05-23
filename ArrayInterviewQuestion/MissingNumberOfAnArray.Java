public class MissingElement {
    public static void main(String[] args) {
        MissingElement me=new MissingElement();
        int array[]={1,2,3,4,5,6,8,9,10};
            me.missingElement(array);

    }
    public void missingElement(int[] array){
        int sum1=0,sum2=0;
        for(int i:array){
            sum1+=i;
        }
        sum2=(10*(10+1))/2;
        int difference=sum2-sum1;
        System.out.println("Missing number is:"+difference);
    }
}
