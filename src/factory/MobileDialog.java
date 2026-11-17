package factory;

public class MobileDialog extends Dialog{
    public IButton createButton(){
        return new HTMLButton();
    }
}
