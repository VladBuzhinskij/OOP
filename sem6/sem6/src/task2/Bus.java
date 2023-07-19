package task2;
/**Автобус */
public class Bus extends Vehicle {
    /**Конструктор*/
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        //TODO Auto-generated constructor stub
    }
    /**Расчет скорости */
    public double calculateAllowedSpeed(){
        return super.getMaxSpeed() * 0.6;
    }
    
}
