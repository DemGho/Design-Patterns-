package factory;

import factory.WindowsButton;

public class WindowsDialog extends Dialog {
    public IButton createButton(){
        return new WindowsButton();
    }
}
