package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;
/**Класс Модели хранящей информация в списке */
public class ModelList implements iGetModel {
    private List<Student> students;
    /**Конструктор класса */
    public ModelList(List<Student> students) {
        this.students = students;
    }
    /**Метод возвращает список студентов */
    public List<Student> getAllStudents()
    {
        return students;
    }
    /**Метод удаляет студента из списка, или говорит что такого студента нет */
    public List<Student> deleteStudent (Long student) {
        //для примера
        List<Student> studen  = new ArrayList<Student>();
        return studen;
    }
}
