package com.consumer.test;

import com.api.service.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName :   ConsumerTest
 * @Description: 启动服务消费者，访问服务测试类
 * @Author: mzl
 * @CreateDate: 2022/5/8 3:04
 * @Version: 1.0
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        context.start();

        DemoApi demoApi = (DemoApi) context.getBean("demoApi");
        System.out.println(demoApi.sayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
