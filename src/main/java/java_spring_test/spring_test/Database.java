package java_spring_test.spring_test;

public class Database {

    private static Database database;

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
    private Database() {

    }
}
