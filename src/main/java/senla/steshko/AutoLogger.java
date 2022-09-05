package senla.steshko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import senla.steshko.configuration.ServiceTest;
import senla.steshko.testDate.Animal;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AutoLogger {

    @Autowired
    private ServiceTest service;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(AutoLogger.class, args);
        Animal animal = new Animal();
        animal.sayHello();
    }

    @PostConstruct
    public void test(){
        service.saySmth();
    }
}
