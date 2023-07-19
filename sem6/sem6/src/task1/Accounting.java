package task1;

import java.sql.Date;
import java.util.List;
/**класс Бухгалтерия */
public class Accounting extends Employee{
    /**Базовая ставка */
    private int baseSalary;
    /**Список работников */
    private List<Employee> employee;

    /**Конструктор класса */
    public Accounting(String name, Date dob,int baseSalary) {
        super(name, dob);
        this.baseSalary=baseSalary;
    }
    /**Расчет з/п */
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
