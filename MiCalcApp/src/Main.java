import model.CalcLogic;
import view.CalcUI;
import controller.CalcController;

public class Main {
    public static void main(String[] args) {
        CalcLogic model = new CalcLogic();
        CalcUI view = new CalcUI();
        CalcController controller = new CalcController(model, view);
    }
}