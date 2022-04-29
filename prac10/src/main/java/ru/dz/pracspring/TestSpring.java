package ru.dz.pracspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        LightUser lightUser = context.getBean("lightUserBean",LightUser.class);
        Lighter lighter = (Lighter)context.getBean(args[0]);
        lighter.doLight();
        context.close();

    }
}
