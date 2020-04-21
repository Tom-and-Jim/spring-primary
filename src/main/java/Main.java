import chapter01.Book;
import chapter05.DemoServiceAutoWeird;
import chapter05.DemoServiceConfig;
import chapter05.DemoServiceConfig2;
import chapter05.DemoServiceConfigure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoServiceConfig2.class);
//        DemoServiceConfigure aa = applicationContext.getBean("aa", DemoServiceConfigure.class);
//        System.out.println(aa.toString());
        DemoServiceAutoWeird demoServiceAutoWeird = applicationContext.getBean("demoServiceAutoWeird", DemoServiceAutoWeird.class);
        System.out.println(demoServiceAutoWeird.toString());

    }
}
