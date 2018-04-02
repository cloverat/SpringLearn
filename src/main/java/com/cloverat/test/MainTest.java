package com.cloverat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyujun
 * @date 18-4-2
 */
public class MainTest {

    public static void main(String[] args) {
        // 传统做法
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setMessage("Spring");
        helloSpring.getMessage();

        // spring做法

        // 第一步是我们使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文。
        // 这个 API 加载 beans 的配置文件并最终基于所提供的 API，它处理创建并初始化所有的对象，即在配置文件中提到的 beans。
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // 第二步是使用已创建的上下文的 getBean() 方法来获得所需的 bean。
        // 这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象。
        // 一旦有了对象，你就可以使用这个对象调用任何类的方法。
        HelloSpring helloSpring2 = (HelloSpring) context.getBean("helloSpring");// 对应配置文件中的id
        helloSpring2.getMessage();
    }
}
