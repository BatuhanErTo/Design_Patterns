package Factory_Method;

public class Main {
    private static Creator creator;
    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("Windows 10"))
            creator = new WindowsCreator();
        else
            creator = new HtmlCreator();
        creator.render();
    }
}