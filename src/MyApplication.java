import model.BankModel;
import model.BankModelManager;
import viewModel.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewHandler;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    BankModel model = new BankModelManager();
    ViewModelFactory factory = new ViewModelFactory(model);
    setUserAgentStylesheet(STYLESHEET_MODENA);
    ViewHandler view = new ViewHandler(factory);
    view.start(primaryStage);
    System.out.println("!!!!!!!!!!!!!!");
  }
}
