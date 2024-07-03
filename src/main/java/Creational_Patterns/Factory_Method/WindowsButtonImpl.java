package Factory_Method;

public class WindowsButtonImpl implements Button{

    @Override
    public void click() {
        System.out.println("Windows button is clicked");
    }
}
