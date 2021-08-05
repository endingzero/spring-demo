package com.zerer.springframework.test;


import com.zerer.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zerer.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zerer.springframework.context.support.ClassPathXmlApplicationContext;
import com.zerer.springframework.test.bean.UserService;
import com.zerer.springframework.test.common.MyBeanFactoryPostProcessor;
import com.zerer.springframework.test.common.MyBeanPostProcessor;
import org.junit.Test;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public class ApiTest {

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);

        System.out.println("ApplicationContextAware："+userService.getApplicationContext());
        System.out.println("BeanFactoryAware："+userService.getBeanFactory());

    }
}
