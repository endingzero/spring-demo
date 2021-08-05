package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.BeanFactory;
import com.zerer.springframework.beans.factory.config.BeanDefinition;
import com.zerer.springframework.beans.factory.config.BeanPostProcessor;
import com.zerer.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:32
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    /** BeanPostProcessors to apply in createBean */
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();

    @Override
    public Object getBean(String name, Object... args) throws BeansException {

        return doGetBean(name, args);
    }

    @Override
    public Object getBean(String name) {

        return doGetBean(name, null);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    private <T> T doGetBean(String name,final Object[] args) {
        Object singleton = getSingleton(name);
        if (singleton != null) {
            return (T) singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);

        return (T) createBean(name, beanDefinition,args);
    }

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }


    /**
     * Return the list of BeanPostProcessors that will get applied
     * to beans created with this factory.
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String name);

}
