package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.factory.config.SingleBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @program spring-demo
 * @description:
 * @author: zhuangjiewei
 * @create: 2021/07/24 11:33
 */
public class DefaultSingletonBeanRegistry implements SingleBeanRegistry {


    private Map<String,Object> singletonBeanMap = new HashMap<>();

    public Object getSingleton(String beanName) {
        return singletonBeanMap.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){
        singletonBeanMap.put(beanName, singletonObject);
    }
}
