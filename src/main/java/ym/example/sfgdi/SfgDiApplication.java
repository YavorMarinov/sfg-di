package ym.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ym.example.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println("--------------- I18n Bean");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController)ctx.getBean("myController");

		System.out.println("--------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("--------------- Property");
		ProperyInjectedController properyInjectedController = (ProperyInjectedController) ctx.getBean("properyInjectedController");
		System.out.println(properyInjectedController.getGreeting());

		System.out.println("--------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
