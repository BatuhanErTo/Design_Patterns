package Creational_Patterns.Factory_Method;

public class HtmlCreator extends Creator{
    @Override
    public Button createButton() {
        return new HtmlButtonImpl();
    }
}
