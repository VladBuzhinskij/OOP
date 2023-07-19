package task1;

import java.sql.Date;
/**Класс работник*/
public class Employee {
    /**Поле имени */
    private String name;
    /**Дата трудоустройства */
    private Date dob;
    /** конструктор класса*/
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    /**Вывод информации*/
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}