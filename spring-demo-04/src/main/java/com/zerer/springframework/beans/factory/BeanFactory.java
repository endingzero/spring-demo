package com.zerer.springframework.beans.factory;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhuangjw
 * @description:
 */
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args) throws BeansException;
}
