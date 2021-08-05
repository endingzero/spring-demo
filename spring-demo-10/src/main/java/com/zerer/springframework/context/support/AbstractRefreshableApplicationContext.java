package com.zerer.springframework.context.support;

import com.zerer.springframework.beans.BeansException;
import com.zerer.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zerer.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author zhuangjw
 * @description:
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
