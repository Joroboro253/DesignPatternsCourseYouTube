package proselyte.basepatterns.structural.adapter;

import proselyte.basepatterns.structural.adapter.AdapterJavaToDatabase;
import proselyte.basepatterns.structural.adapter.Database;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
