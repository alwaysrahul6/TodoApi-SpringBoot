package TodoApi.TodoApi;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAsepct {
    @Around("@annotation(TodoApi.TodoApi.TimeMonitor)")
    public void logtime(ProceedingJoinPoint joinPoint){
        long start = System.currentTimeMillis();

        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Something Went Wrong: ");
        }finally {
            long end = System.currentTimeMillis();

            long totalExceutionTime = end - start;

            System.out.println("Total Time of the Method is: " + totalExceutionTime+ " ms.." );
        }
    }

}
