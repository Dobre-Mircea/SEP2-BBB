package view;

import viewModel.PopUpViewModel;

import javafx.scene.layout.Region;

public class PopUpController
{
    private Region root;
    private PopUpViewModel viewModel;
    ViewHandler viewHandler;
    public void init(ViewHandler viewHandler, PopUpViewModel viewModel, Region root)
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
}
