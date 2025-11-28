package org.j2os;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Manager manager1 = context.getBean(Manager.class);
        manager1.execute();

        Manager manager2 = context.getBean(Manager.class);
        manager2.execute();

        context.close();
    }
}