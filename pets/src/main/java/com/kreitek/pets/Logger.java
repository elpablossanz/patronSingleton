package main.java.com.kreitek.pets;

public class Logger {
    private static volatile Logger instance = null;
    private int cont=0;

    public Logger() {
        if (instance != null) {
            throw new RuntimeException("error");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized(Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void debug(String log) {
        System.out.println("[debug]["+ cont +"]" + log);
        cont++;


    }
}
