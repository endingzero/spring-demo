package com.zerer.springframework.beans.factory;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zerer.springframework.beans.factory.config.BeanDefinition;
import com.zerer.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author zhuangjw
 * @description:提供分析和修改Bean以及预先实例化的操作接口，不过目前只有一个 getBeanDefinition 方法。
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
