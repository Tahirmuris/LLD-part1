package designPattern.singletonDesign;

public class DbConnector {

    private String url;
    private String username;
    private String password;
    private String driverName;
    private int poolSize;

    private DbConnector() {
    }


    private static DbConnector dbConnectorInstance;

    public static DbConnector getInstance() {
//        if (dbConnectorInstance == null) {
//            synchronized (DbConnector.class) {
//                if (dbConnectorInstance == null) {
//                    dbConnectorInstance = new DbConnector();
//                }
//            }
//        }
//
//        return dbConnectorInstance;

        return DbConnectorHelper.INSTANCE;
    }

    /*
    The Bill Pugh Singleton Design is considered a lazy initialization approach
    because the singleton instance is created only when the getInstance method is first called,
    while also handling thread safety and initialization concerns effectively.
     */
    private static class DbConnectorHelper {
        private static final DbConnector INSTANCE = new DbConnector();
    }


}
