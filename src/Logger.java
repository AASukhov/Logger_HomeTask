import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String text = dtf.format(LocalDateTime.now());

    protected int num = 1;

    private static Logger logger;

    private Logger() {
    };

    public static Logger getInstance() {
        if(logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + text + " " + num++ + "] " + msg);
    }
}
