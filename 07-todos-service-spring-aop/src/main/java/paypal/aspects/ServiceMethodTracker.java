package paypal.aspects;

import org.aspectj.lang.JoinPoint;
//import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMethodTracker {
	
	@Before("execution(* *..services.*.*(..))")
	public void trackMethod(JoinPoint point) {
		String methodName = point.getSignature().getName();
		System.err.println(methodName + " service method called \n");
	}

}
