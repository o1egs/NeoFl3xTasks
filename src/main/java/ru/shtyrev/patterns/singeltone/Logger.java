package ru.shtyrev.patterns.singeltone;

import java.util.Objects;

public class Logger {
    private static volatile Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void classLogg(Object object, String info) {
        System.out.println("Log info: 21.07.23 - "+ object.getClass().getSimpleName() +" - " + info);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println(logger1.equals(logger2));
    }
}
