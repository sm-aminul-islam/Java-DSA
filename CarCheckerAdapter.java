package LambdaExpression;
public class CarCheckerAdapter implements Main.ICarChecker {
    public boolean isValidColor(Car car){
        return  car.getColor().equalsIgnoreCase("white");
    }
}
