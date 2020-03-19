package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BankModelManager implements BankModel
{
    private PropertyChangeSupport support;


    @Override
    public void addListener(String propertyName, PropertyChangeListener listener)
    {
        support.addPropertyChangeListener(propertyName, listener);
    }

    @Override
    public void removeListener(String propertyName, PropertyChangeListener listener)
    {
        support.removePropertyChangeListener(propertyName, listener);
    }
}
