package CodevsColor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car audi=new Car("white");
        Car bmw=new Car("black");
        Car bentley=new Car("blue");
        Car bugatti=new Car("red");
        Car jagauar=new Car("green");
        ArrayList <Car> carlist=new ArrayList<>();
        carlist.add(audi);
        carlist.add(bmw);
        carlist.add(bentley);
        carlist.add(bugatti);
        carlist.add(jagauar);
        System.out.println("Before sorting :");
        for(Car c:carlist){
            System.out.println("car color:"+c.getColor());
        }
        Thread sortingThread=new Thread(()->{
            Collections.sort(carlist,(car1,car2)->car1.getColor().compareTo(car2.getColor()));
            System.out.println("After sorting:");
            for(Car c:carlist){
                System.out.println("Car color :"+c.getColor());
            }
        });
        sortingThread.start();


    }
}
