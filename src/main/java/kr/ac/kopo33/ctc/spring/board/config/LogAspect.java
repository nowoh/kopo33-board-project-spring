package kr.ac.kopo33.ctc.spring.board.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
  
//  private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
  
  @Before("execution(* kr.ac.kopo33.ctc.spring.board.service.*.*Aop(..))")
  public void onBeforeHandler(JoinPoint joinPoint) {
    System.out.println("============onBeforeHandler");
  }
  
  @After("execution(* kr.ac.kopo33.ctc.spring.board.service.*.*Aop(..))")
  public void onAfterHandler(JoinPoint joinPoint) {
    System.out.println("============onAfterHandler");
  }
  
  @AfterReturning(pointcut = "execution(* kr.ac.kopo33.ctc.spring.board.service.*.*Aop(..))", returning = "str")
  public void onAfterReturnHandler(JoinPoint joinPoint) {
    
  }
  
  @Pointcut("execution(* kr.ac.kopo33.ctc.spring.board.service.*.*Aop(..))")
  public void onPointcut(JoinPoint joinPoint) {
    
  }
}
