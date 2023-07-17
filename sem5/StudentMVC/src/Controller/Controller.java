package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.ModelList;
import Model.Student;
import Model.hachModel;
import View.View;
/**
 * Класс контроллер
 */
public class Controller {
    /**Поле "Модель" */
    private iGetModel model;
    /**Поле "Вид" ангилийский */
    private iGetView viewEng;
    /**Поле "Вид" Русский */
    private iGetView view;
    /**Поле список студентов */
    private List<Student> students = new ArrayList<>();
    /**Конструктор контроллера */
    public Controller(iGetModel model, iGetView view,iGetView viewEng) {
        this.model = model;
        this.view = view;
        this.viewEng = viewEng;
    }

    /**Метол проверки наличия данных
     * Возвращает TRUE если данне есть
     * Возвращает ELSE если данных нет
     */
    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**Метод обновления 
     * Печатает список студентов, или говорит что он пуст
     */
    public void update()
    {
        //MVP
        students = model.getAllStudents();
        if(testData(students))
        {
           view.printAllStudents(students);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**Метод запуска, принимает команды из класса Command и выполняет их
     */
    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case LISTENG:
                    viewEng.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    String num = view.prompt("Введите номер:");
                    long nu =Long.parseLong(num);
                    model.deleteStudent(nu);
                    view.printAllStudents(model.getAllStudents());
                    break;
            }

        }
    }

    
}
