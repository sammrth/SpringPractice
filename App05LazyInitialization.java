//package com.app.lazy.initialization;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//@Component
//class A{
//	
//}
//@Component
//class B{
//	private A a;
//	public B(A a) {
//		super();
//		this.a = a;
//		System.out.println("This is why its Eager");
//	}
//	public void doSomething() {
//		System.out.println("Bean is initialized");
//	}
//}
//@SpringBootApplication
//@ComponentScan
//public class App05LazyInitialization {
//	public static void main(String[] args) {
//		var context=new AnnotationConfigApplicationContext(App05LazyInitialization.class);
//		System.out.println("Something in App class");
//	}
//}
