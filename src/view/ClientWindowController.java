package view;

import viewModel.ClientWindowViewModel;

import javafx.scene.layout.Region;

public class ClientWindowController
{
    private Region root;
    private ClientWindowViewModel viewModel;
    ViewHandler viewHandler;
    public void init(ViewHandler viewHandler, ClientWindowViewModel viewModel, Region root)
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

    public void logOut()
    {
        viewHandler.openView("logIn");
    }
}
