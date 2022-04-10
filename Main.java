package LambdaExpression;

public class Main {
    public interface ICarChecker{
        public boolean isValidColor(Car car);
    }
    public static void main(String[] args) {
        Car audi=new Car("white");
        Car bmw=new Car("black");
        ICarChecker adapter=(Car car)->{
            return car.getColor().equalsIgnoreCase("white");
        };
//        CarCheckerAdapter adapter=new CarCheckerAdapter(){
//            @Override
//            public boolean isValidColor(Car car) {
//                return super.isValidColor(car);
//            }
//        };
        System.out.println("color of Audi checker result:"+adapter.isValidColor(audi));
        System.out.println("color of bmw checker result :"+adapter.isValidColor(bmw));
    }
}
