package fn.main.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static fn.main.util.MyLogger.info;

@Component
@Aspect
public class loggerAspect {

    @Autowired
    ObjectMapper mapper;

    @Around(" (execution(* fn.main.controller..*.*(..)))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(joinPoint.getSignature())
                .append("(");
        Arrays.stream(joinPoint.getArgs()).forEach(o->{
            try {
                String s = mapper.writeValueAsString(o);
                stringBuilder.append(s).append(",");
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
        stringBuilder.append(")");
        info(stringBuilder.toString());
        Object ret =  joinPoint.proceed();
        info(joinPoint.getSignature().toString().concat(" RETURN"));
        return ret;
    }
}
