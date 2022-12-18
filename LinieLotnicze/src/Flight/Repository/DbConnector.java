package Flight.Repository;

public class DbConnector {
    public Connection getConnection(String connectionString){
        return new Connection(connectionString);
    }
}
