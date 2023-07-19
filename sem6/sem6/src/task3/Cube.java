package task3;

/**Куб */
public class Cube implements Shape {
    /**Длинна стороны куба */
    private int edge;
    /**Конструктор */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**Площадь куба*/
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /**Объем куба */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
