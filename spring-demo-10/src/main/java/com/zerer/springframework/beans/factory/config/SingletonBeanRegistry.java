package com.zerer.springframework.beans.factory.config;

import com.zerer.springframework.context.event.ApplicationEventMulticaster;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:29
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String applicationEventMulticasterBeanName, ApplicationEventMulticaster applicationEventMulticaster);
}
