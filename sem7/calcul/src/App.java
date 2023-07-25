import controller.Controller;
import view.View;
import view.iGetView;

public class App {
    public static void main(String[] args) throws Exception {
        
        iGetView view = new View();
        
        Controller control = new Controller( view);

       
        control.run();

    }
}
