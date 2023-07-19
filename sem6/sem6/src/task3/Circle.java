package task3;

/** Круг */
public class Circle implements Shape2d {
    /**Радиус */
    private double radius;
    /**Конструктор */
    public Circle(double radius) {
        this.radius = radius;
    }
    /**Расчет площади круга*/
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
