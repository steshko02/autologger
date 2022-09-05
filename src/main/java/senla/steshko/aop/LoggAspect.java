package senla.steshko.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggAspect {

    private static final Logger log = Logger.getLogger(LoggAspect.class.getName());

    @Pointcut("@annotation(autoTimeLogg)")
    public void callAt(AutoTimeLogg autoTimeLogg) {
    }

    @Around(value = "callAt(autoTimeLogg)", argNames = "pjp,autoTimeLogg")
    public Object Around(ProceedingJoinPoint pjp, AutoTimeLogg autoTimeLogg) throws Throwable {
        if (autoTimeLogg.isLogg()) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Object obj = pjp.proceed();
            stopWatch.stop();
            log.info("Method"+ pjp.getSignature()+" time work is " + stopWatch.getTotalTimeMillis() + " ms");
            return obj;
        }
        return pjp.proceed();
    }
}
