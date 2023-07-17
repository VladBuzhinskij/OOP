package Controller;

import java.util.List;

import Model.Student;
/**Интерфейс Модели */
public interface iGetModel {
    
    public List<Student> getAllStudents();    
    public  List<Student> deleteStudent (Long student);
}
