package chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PhoneConfig.class);
        Phone phone = applicationContext.getBean("phone", Phone.class);
        System.out.println(phone.toString());
    }
}
