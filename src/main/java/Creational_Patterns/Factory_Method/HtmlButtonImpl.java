package Creational_Patterns.Factory_Method;

public class HtmlButtonImpl implements Button{

    @Override
    public void click() {
        System.out.println("Html Button is clicked");
    }
}
