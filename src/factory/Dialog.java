package factory;

public abstract class Dialog {
    public abstract IButton createButton();

    public void render(){
        IButton ib = createButton();
        ib.render();
    }

}
