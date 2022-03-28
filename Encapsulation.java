package encapsulation;
public class Encapsulation {
    public static void main(String[] args) {
     Laptop l1=new Laptop();
l1.setPrice(10000);
    }
}
 class  Laptop{
    int ram ;
    private  int price;

    public void setPrice(int price) {
        boolean isAdmin=true;
        if(!isAdmin){
            System.out.println("You can not set the price");
        }
        else {
            this.price = price;
        }
    }

     public int getPrice() {
         return price;
     }

     public void setRam(int ram) {
         this.ram = ram;
     }

     public int getRam() {
         return ram;
     }

 }
