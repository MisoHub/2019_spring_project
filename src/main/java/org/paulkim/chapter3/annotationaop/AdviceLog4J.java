package org.paulkim.chapter3.annotationaop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AdviceLog4J {
	
	public static Logger logger = Logger.getLogger(AdviceLog4J.class.getName());
	
	@Pointcut("within(org.paulkim.chapter3.annotationaop.MessagePrinter)")
	private void myPointcutMethod() {}
	
	@Around("myPointcutMethod()")
	public void messageLogger(ProceedingJoinPoint joinPoint) {
		String signMessage = joinPoint.getSignature().toShortString();
		logger.info(".........<around>........"+signMessage);
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// adjust pointcut expression directly
	
	/* ERROR 
	 * Error creating bean with name 'myMessage' defined in file [D:\workspace\EeeeeeasySpring\target\classes\org\paulkim\chapter3\annotationaop.xml]:
	 * BeanPostProcessor before instantiation of bean failed;
	 * nested exception is java.lang.IllegalArgumentException: ProceedingJoinPoint is only supported for around advice
	 */
//
//	@Before("within(org.paulkim.chapter3.annotationaop.Message)")
//	public void beforeMessageLogger(ProceedingJoinPoint joinPoint) {
//		String signMessage = joinPoint.getSignature().toShortString();
//		try {
//			logger.info(".........<before>........"+signMessage);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	/* 
	 * @AfterReturing
	 * @AfterThrowing
	 * @After
	 * .....
	 */

}
