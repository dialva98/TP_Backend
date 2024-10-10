import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ApplicationRunner {

    protected static final Logger logger = LogManager.getLogger();

    void run() {
        logger.info("La aplicación está funcionando");
    }
}