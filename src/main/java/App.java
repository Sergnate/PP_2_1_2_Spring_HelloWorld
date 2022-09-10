import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = applicationContext.getBean(Cat.class);
        Cat catSecond = applicationContext.getBean(Cat.class);
        System.out.printf("HelloWord:%s \nCat:%s", bean == bean2, cat == catSecond);

    }
}