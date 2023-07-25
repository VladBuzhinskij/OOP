package controller;
import model.CalcDecorator;
import model.Calcull;
import model.iCalcul;
import view.iGetView;
/**Контроллер */
public class Controller {
    private iGetView view;
    /**Конструктор */
    public Controller(iGetView view) {
        this.view = view;

    }
    /**Проверка на Double
     * Возвращает True или False
     */
    public boolean doubleParse(String args) {
        try {
            Double.parseDouble(args);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**Запуск контроллера */
    public void run() {

        boolean getNewIteration = true;
        while (getNewIteration) {

            Double[] input = new Double[4];
            String[] param = new String[] { "a1", "a2", "b1", "b2" };
            for (int i = 0; i < 4; i++) {
                String command = view.prompt("Введите " + param[i] + ":");
                if (doubleParse(command)) {
                    input[i] = Double.parseDouble(command);
                } else {
                    i--;
                }
                System.out.println();
            }
            iCalcul mod = new Calcull(input[0], input[1], input[2], input[3]);
            iCalcul model = new CalcDecorator(mod,new Logger());
            for (int ii = 0; ii < 1; ii++) {
                String command = view.prompt("Введите оператор:");
                if (command.intern() == "+") {
                    System.out.println("Результат: " + model.summ());
                } else if (command.intern() == "-") {
                    System.out.println("Результат: " + model.subss());
                } else if (command.intern() == "*") {
                    System.out.println("Результат: " + model.multt());
                } else if (command.intern() == "/") {
                    System.out.println("Результат: " + model.divv());
                } else {
                    ii--;
                }
            }

        }

    }
}
