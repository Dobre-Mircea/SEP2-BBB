package view;

import viewModel.ViewModelFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ViewHandler extends Application
{
    private Stage primaryStage;
    private Stage secoundStage;
    private Scene currentScene;
    private Scene secoundScene;

    private ViewModelFactory factory;
    private PopUpController popUpController;
    private ClientWindowController clientWindowController;
    private LogInController logInController;
    private RegisterController registerController;

    public ViewHandler(ViewModelFactory factory)
    {
        this.factory = factory;
        this.currentScene = new Scene(new Region());
        this.secoundScene = new Scene(new Region());
    }

    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.secoundStage = new Stage();
        //this.currentScene = new Scene(new Region());
        this.openView("logIn");
    }


    public void openView(String id)
    {
        String title = null;
        Region root = null;
        switch (id)
        {
            case "logIn":
                root = loadLogIn("LogIn.fxml");
                currentScene.setRoot(root);
                title = "BBB - Log In";
                primaryStage.setTitle(title);
                //primaryStage.setAlwaysOnTop(true);
                primaryStage.setResizable(false);
                primaryStage.setScene(currentScene);
                primaryStage.setWidth(root.getPrefWidth());
                primaryStage.setHeight(root.getPrefHeight());
                primaryStage.show();
                break;

            case "register":
                root = loadRegister("Register.fxml");
                currentScene.setRoot(root);
                title = "BBB - Register";
                primaryStage.setTitle(title);
                //primaryStage.setAlwaysOnTop(true);
                primaryStage.setResizable(false);
                primaryStage.setScene(currentScene);
                primaryStage.setWidth(root.getPrefWidth());
                primaryStage.setHeight(root.getPrefHeight());
                primaryStage.show();
                break;

            case "client":
                root = loadClient("ClientWindow.fxml");
                currentScene.setRoot(root);
                title = "BBB - Client";
                primaryStage.setTitle(title);
                //primaryStage.setAlwaysOnTop(true);
                primaryStage.setResizable(false);
                primaryStage.setScene(currentScene);
                primaryStage.setWidth(root.getPrefWidth());
                primaryStage.setHeight(root.getPrefHeight());
                primaryStage.show();
                break;

            case "popUp":
                Region root2 = loadRegister("Register.fxml");
                //Region root2 = loadPopUpView("PopUp.fxml");
                secoundScene.setRoot(root2);
                String title2 = "WARNING";
                secoundStage.setTitle(title2);
                secoundStage.setResizable(false);
                secoundStage.setScene(secoundScene);
                secoundStage.setWidth(root2.getPrefWidth());
                secoundStage.setHeight(root2.getPrefHeight());
                secoundStage.show();
                break;
        }

    } ////////////////////////////////////////////////

    public void closeView()
    {
        primaryStage.close();
    }

    public void closeSecondary()
    {
        secoundStage.close();
    }

    private Region loadLogIn(String fxmlFile)
    {
        Region root = null;
        if (logInController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                root = loader.load();
                logInController = loader.getController();
                logInController.init(this, factory.getLogInViewModel(), root);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            logInController.reset();
        }
        return logInController.getRoot();
    }
    private Region loadClient(String fxmlFile)
    {
        Region root = null;
        if (clientWindowController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                root = loader.load();
                clientWindowController = loader.getController();
                clientWindowController.init(this, factory.getClientWindowViewModel(), root);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            clientWindowController.reset();
        }
        return clientWindowController.getRoot();
    }

    private Region loadRegister(String fxmlFile)
    {
        Region root = null;
        if (registerController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                root = loader.load();
                registerController = loader.getController();
                registerController.init(this, factory.getRegisterViewModel(), root);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            registerController.reset();
        }
        return registerController.getRoot();
    }







}
