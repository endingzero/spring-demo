package com.zerer.springframework.beans.factory.config;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:29
 */
public interface SingleBeanRegistry {

    Object getSingleton(String beanName);
}
