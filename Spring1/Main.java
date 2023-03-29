package ua.kiev.prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        OrdersProcessor op = (OrdersProcessor) context.getBean("ordersProcessor");
        op.process();
    }
}


