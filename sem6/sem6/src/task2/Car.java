package task2;
/**Автомобиль */
public class Car extends Vehicle {
    /**Конструктор*/
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        //TODO Auto-generated constructor stub
    }
    /**Расчет скорости */
    public double calculateAllowedSpeed(){
        return super.getMaxSpeed() * 0.8;
    }
}
