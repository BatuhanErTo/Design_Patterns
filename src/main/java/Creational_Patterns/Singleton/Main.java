package Creational_Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.createDbConnection();
        db.saveToDb();
    }
}
