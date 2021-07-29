package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:44
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        BeanDefinition beanDefinition =  beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + name + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {

        beanDefinitionMap.put(beanName,beanDefinition);

    }
}