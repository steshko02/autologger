package senla.steshko.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import senla.steshko.aop.LoggAspect;

@Configuration
@ComponentScan("senla.steshko")
public class LoggerAutoConfiguration {
//    @Bean
//    public LoggAspect loggableAspect(){
//        return new LoggAspect();
//    }
}
