package senla.steshko.configuration;

import org.springframework.stereotype.Service;
import senla.steshko.aop.AutoTimeLogg;

@Service
public class ServiceTest {

    @AutoTimeLogg
    public void saySmth(){
        System.out.println("dfsfnksdkfs sdf ");
    }
}
