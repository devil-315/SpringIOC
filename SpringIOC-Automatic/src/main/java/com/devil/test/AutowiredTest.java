package com.devil.test;

import com.devil.entity.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class AutowiredTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowired.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.getCat().shout();
        animal.getDog().shout();
    }
}
