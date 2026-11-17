package factory;
import factory.HTMLButton;

public class WebDialog extends Dialog {
    public IButton createButton(){
        return new HTMLButton();
    }
}
