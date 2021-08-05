package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author zhuangjw
 * @description:
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
