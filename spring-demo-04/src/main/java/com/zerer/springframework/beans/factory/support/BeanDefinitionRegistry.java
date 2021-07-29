package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.factory.config.BeanDefinition;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:44
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
