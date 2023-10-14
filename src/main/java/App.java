import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                applicationContext.getBean("helloworld",HelloWorld.class);
        HelloWorld helloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
        System.out.println("HelloWorld check: " + (Objects.equals(helloWorld, helloWorld2)));
        System.out.println(helloWorld.toString());
        System.out.println(helloWorld2.toString()+"\n");

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat check: " + (Objects.equals(cat1, cat2)));
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
    }
}