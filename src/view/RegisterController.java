package view;

import viewModel.RegisterViewModel;
import javafx.scene.layout.Region;

public class RegisterController
{
    private Region root;
    private RegisterViewModel viewModel;
    ViewHandler viewHandler;
    public void init(ViewHandler viewHandler, RegisterViewModel viewModel, Region root)
    {
        this.root = root;
        this.viewModel = viewModel;
        this.viewHandler = viewHandler;
    }

    public void reset()
    {

    }

    public Region getRoot()
    {
        return this.root;
    }

    public void goBack()
    {
        viewHandler.openView("logIn");
    }
}
