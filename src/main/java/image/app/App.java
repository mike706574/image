package image.app;

import image.core.CoreModule;
import image.web.WebModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CoreModule.class, WebModule.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
