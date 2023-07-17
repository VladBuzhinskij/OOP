package Model;
/**Класс студент*/
public class Student extends Person implements Comparable<Student> {
    /**Поле ID студента*/
    private int id;
    /**Конструктор класса*/
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**Получение ID*/
    public int getId() {
        return id;
    }


    /**Запись ID*/
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }


    
    
    
}


