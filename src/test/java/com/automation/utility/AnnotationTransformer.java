package com.automation.utility;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.sun.net.httpserver.Authenticator.Retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {
	@Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(Retry.class);
    }	
}
