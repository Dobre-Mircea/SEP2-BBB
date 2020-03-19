package view;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import viewModel.LogInViewModel;


public class LogInController
{
    @FXML private JFXTextField emailField;
    @FXML private JFXPasswordField passwordField;
    private Region root;
    private LogInViewModel model;
    ViewHandler viewHandler;

    public LogInController()
    {
    }

    public void init(ViewHandler viewHandler, LogInViewModel viewModel, Region root)
    {
        this.root = root;
        this.model = viewModel;
        this.viewHandler = viewHandler;
    }

    public void reset()
    {

    }

    public Region getRoot()
    {
        return this.root;
    }

    public void loginButton()
    {
        viewHandler.openView("client");
    }

    public void registerButton()
    {
        viewHandler.openView("register");
    }

    public void cancelButton()
    {
        viewHandler.closeView();
    }

}
