package com.zerer.springframework.test.common;


import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.PropertyValue;
import com.zerer.springframework.beans.PropertyValues;
import com.zerer.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zerer.springframework.beans.factory.config.BeanDefinition;
import com.zerer.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
