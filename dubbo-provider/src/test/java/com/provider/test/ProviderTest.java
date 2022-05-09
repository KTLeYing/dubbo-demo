package com.provider.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName :   ProviderTest
 * @Description:  启动服务消费者，暴露服务测试类
 * @Author: mzl
 * @CreateDate: 2022/5/8 2:58
 * @Version: 1.0
 */
public class ProviderTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        System.out.println("Dubbo provider is start.....");
        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
