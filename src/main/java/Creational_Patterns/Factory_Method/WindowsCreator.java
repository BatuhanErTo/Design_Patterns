package Creational_Patterns.Factory_Method;

public class WindowsCreator extends Creator {
    @Override
    public Button createButton() {
        return new WindowsButto