package chap04Java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainByPropOfJava {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ConfigByProp.class);
		ctx.close();

	}

}
