package Model;
/**Класс персонаж*/
public abstract class Person {
    private String name;
    private int age;
    /**Конструктор класса */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        
    /**Получение имени*/
    public String getName() {
        return name;
    }
    /**Запись имени*/
    public void setName(String name) {
        this.name = name;
    }
    /**Получение возраста*/
    public int getAge() {
        return age;
    }
    /**Запись возраста*/
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}
