package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.PersonComparator;

import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    private String acadDegree;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    public void ComparePrintTeacher()
    {    
        sortByFIOStdLst();
        
        System.out.println(teachers);   
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, acadDegree);
        teachers.add(per);
    }

    public void sortByFIOStdLst()
    {
    // List<Student> newStudentList = new ArrayList<Student>(students);
    teachers.sort( new PersonComparator<Teacher>());
    //return newStudentList;
    }
}
