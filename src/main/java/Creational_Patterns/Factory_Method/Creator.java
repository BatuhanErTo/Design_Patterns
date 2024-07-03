package Factory_Method;

public abstract class Creator {
    public void render(){
        Button button = createButton();
        button.click();
    }
    public abstract Button createButton();

}
