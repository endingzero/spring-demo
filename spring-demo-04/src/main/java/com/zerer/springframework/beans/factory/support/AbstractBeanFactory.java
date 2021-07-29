package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.BeanFactory;
import com.zerer.springframework.beans.factory.config.BeanDefinition;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:32
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name, Object... args) throws BeansException {

        return doGetBean(name, args);
    }

    @Override
    public Object getBean(String name) {

        return doGetBean(name, null);
    }


    private <T> T doGetBean(String name,final Object[] args) {
        Object singleton = getSingleton(name);
        if (singleton != null) {
            return (T) singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);

        return (T) createBean(name, beanDefinition,args);
    }



    protected abstract Object createBean(String name, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String name);

}
