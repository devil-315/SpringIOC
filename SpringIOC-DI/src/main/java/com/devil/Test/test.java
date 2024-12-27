package com.devil.Test;

import com.devil.entity.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Address address = (Address) context.getBean("address");
        System.out.println(address);

        Address address2 = (Address) context.getBean("address");
        System.out.println(address2);
        System.out.println(address == address2);
    }
}
