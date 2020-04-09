package chap04config;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class MainByEnvOfXml {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();		
		ctx.register(ConfigByEnv.class);
		ctx.refresh();
		System.out.println("==========");
		ConfigurableEnvironment env = ctx.getEnvironment();
		String javaVersion = env.getProperty("java.version");
		String dbUser = env.getProperty("db.user");
		String dbPassword = env.getProperty("db.password");
		System.out.printf("java version is %s\n",javaVersion);
		System.out.printf("dbUser is %s\n",dbUser);
		System.out.printf("dbPassword is %s\n",dbPassword);
		ctx.close();

	}

}
