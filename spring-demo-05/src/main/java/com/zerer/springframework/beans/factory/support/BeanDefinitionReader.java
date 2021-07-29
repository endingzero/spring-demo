package com.zerer.springframework.beans.factory.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.core.io.Resource;
import com.zerer.springframework.core.io.ResourceLoader;

/**
 * @author zhuangjw
 * @description:
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
