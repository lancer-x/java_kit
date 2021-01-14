package light.com.java_kit.designpattern;

interface Logger {
    void writeLog();
}

class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("write file log");
    }
}

class DbLogger implements Logger {
    public void writeLog() {
        System.out.println("write db log");
    }
}

interface LoggerFactory {
    Logger createLogger();
}

class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}

class DbLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new DbLogger();
    }
}

public class Factory {
    public static void main(String[] args) {
        LoggerFactory factory = new DbLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
