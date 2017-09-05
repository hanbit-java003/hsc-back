package com.hanbit.hsc.back.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hanbit.hsc.back.exception.MyException;

@Aspect
@Component
@Order(20)
public class LoginAspect {

	@Around("@annotation(com.hanbit.hsc.back.annotation.SignInRequired)")
	public Object checkSignedIn(ProceedingJoinPoint pjp) throws Throwable {
		ServletRequestAttributes requestAttributes
			= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		
		HttpSession session = requestAttributes.getRequest().getSession();
		
		if (session.getAttribute("signedIn") == null) {
			throw new MyException(403, "로그인 해주세요.");
		}
		
		return pjp.proceed();
	}
	
}
