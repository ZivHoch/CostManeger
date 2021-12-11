package il.ac.hit.views;

import il.ac.hit.viewmodels.IViewModel;

public interface IView
{
    public void showItems(Item[]items);
    public void showMessage(Message message);
    public void setIViewModel(IViewModel vm);
    public void init();
    public void start();
}
