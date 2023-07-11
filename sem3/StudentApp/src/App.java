import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);




       

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
  
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        StudentGroup group1123 = new StudentGroup(listStud1, 1123);
        // System.out.println(group1123);
        // System.out.println(group4580);

        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group1123);
        listGroup1.add(group4580);
        StudentSteam steam1 = new StudentSteam(listGroup1, 12);
        // System.out.println(steam1);
        for(StudentGroup gr : steam1)
        {
            System.out.println(gr);
        }

        System.out.println("=========================================================");

        Collections.sort(steam1.getSteam());

        for(StudentGroup gru: steam1.getSteam())
        {
            System.out.println(gru);
        }


        // Student s1 = new Student("Иван", 25, 121);
        // Student s2 = new Student("Игорь", 23, 301);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        // Teacher t1 = new Teacher("Иван", 25, "Docent");
        // Teacher t2 = new Teacher("Игорь", 23, "Professor");

        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        // //comS.compare(s1, t2);
        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(s1, t2);

        // Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        // //EmploeeController empControll = new EmploeeController();
        // EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

    }
}
