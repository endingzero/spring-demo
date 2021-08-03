package com.zerer.springframework.context.support;

import com.zerer.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zerer.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author zhuangjw
 * @description:
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
