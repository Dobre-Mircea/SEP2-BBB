package viewModel;

import model.BankModel;

public class ViewModelFactory
{
    private ClientWindowViewModel clientWindowViewModel;
    private LogInViewModel logInViewModel;
    private PopUpViewModel popUpViewModel;
    private RegisterViewModel registerViewModel;

    public ViewModelFactory(BankModel model)
    {
        clientWindowViewModel = new ClientWindowViewModel(model);
        logInViewModel = new LogInViewModel(model);
        popUpViewModel = new PopUpViewModel(model);
        registerViewModel = new RegisterViewModel(model);
    }

    public ClientWindowViewModel getClientWindowViewModel()
    {
        return this.clientWindowViewModel;
    }
    public LogInViewModel getLogInViewModel()
    {
        return this.logInViewModel;
    }
    public PopUpViewModel getPopUpViewModel()
    {
        return this.popUpViewModel;
    }
    public RegisterViewModel getRegisterViewModel()
    {
        return this.registerViewModel;
    }

}
