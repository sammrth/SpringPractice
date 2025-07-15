package com.app.lazy.initialization;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class AA{
	
}
@Component
@Lazy
class BB{
	private AA aa;
	public BB(AA aa) {
		super();
		this.aa = aa;
		System.out.println("This is why its Eager");
	}
	public void doSomething() {
		System.out.println("Bean is initialized");
	}
}
@SpringBootApplication
@ComponentScan
public class App05LazyInitialization_WithoutEager {
	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(App05LazyInitialization_WithoutEager.class);
		System.out.println("Something in App class");
	}
}
