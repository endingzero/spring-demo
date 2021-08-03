package com.zerer.springframework.context;

import com.zerer.springframework.beans.BeansException;

/**
 * @author zhuangjw
 * @description:
 */
public interface ConfigurableApplicationContext extends ApplicationContext{


    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
