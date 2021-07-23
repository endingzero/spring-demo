package com.zerer.springframework;

/**
 * bean的定义
 * @author zhuangjw
 * @description:
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
