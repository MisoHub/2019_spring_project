package org.paulkim.chapter3.xmlaop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog4J {
	public static Logger logger = Logger.getLogger(AdviceLog4J.class.getName());
	
	public void messageLogger(ProceedingJoinPoint joinPoint) {
		String signMessage = joinPoint.getSignature().toShortString();
		logger.info("-----------------------------"+signMessage);
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
