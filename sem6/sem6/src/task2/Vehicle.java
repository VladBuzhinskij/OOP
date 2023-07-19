package task2;
/**Транспортное средство*/
public class Vehicle {
    int maxSpeed;
    String type;
    /**Конструктор*/
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /**Вывод максимальной скорости*/
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**Получение типа*/
    public String getType() {
        return this.type;
    }
}
