package view;
import java.util.Scanner;
/**Вид*/
public class View implements iGetView {
    public String prompt(String msg) {
       Scanner in = new Scanner(System.in);
       System.out.print(msg);
       return in.nextLine();
    }
}
