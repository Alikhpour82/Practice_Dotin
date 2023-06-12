package main;

public class Connection {

    private static Connection instance;

    private Connection() {}

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static Connection getInstance() {
        if (instance == null) instance = new Connection();
        return instance;
    }
}
