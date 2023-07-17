package Model;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

/**Класс Модели хранящей информация в HashMap */
public class hachModel implements iGetModel{
    /**Поле данных  */
    private HashMap <Long,Student> students =new HashMap<>();
    /**Конструктор класса */ 
    public hachModel(List<Student> students) {
        long i=0;
        for (Student stud:students){
            this.students.put(i, stud);
            i++;
        }
    }
    /**Метод удаляет студента из списка, или говорит что такого студента нет */ 
    public List<Student> deleteStudent (Long student) {
        if (student>students.size()){
            System.out.println("студента с таким номером нет");
        }
        this.students.remove(student);
        List<Student> studen  = new ArrayList<Student>(students.values());
        return studen;
    }


    /**Метод возвращает список студентов */ 
    public List<Student> getAllStudents()
    {
        List<Student> student  = new ArrayList<Student>(students.values());
        return student;
        
    }
}
