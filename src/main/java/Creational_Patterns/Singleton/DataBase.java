package Creational_Patterns.Singleton;

public class DataBase {
    private static DataBase db;

    private DataBase(){

    }

    public static DataBase createDbConnection(){
        if(db == null){
            db = new DataBase();
        }
        return db;
    }

    public void saveToDb(){
        System.out.println("Saved to db");
    }
}
