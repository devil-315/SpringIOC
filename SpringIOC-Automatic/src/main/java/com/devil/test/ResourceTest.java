package com.devil.test;

import com.devil.entity.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：ResourceTest
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class ResourceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-resource.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.getCat().shout();
        animal.getDog().shout();
    }
}
