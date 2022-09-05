package senla.steshko.testDate;

import org.springframework.stereotype.Component;
import senla.steshko.aop.AutoTimeLogg;

public class Animal {

    private String name;

    @AutoTimeLogg
    public  void  sayHello() throws InterruptedException {
        System.out.println("my name is " + name);
    }
    @AutoTimeLogg
    public String getName() {
        return name;
    }

    @AutoTimeLogg
    public void setName(String name) {
        this.name = name;
    }
}
