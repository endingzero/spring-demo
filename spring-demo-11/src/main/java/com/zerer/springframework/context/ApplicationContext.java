package com.zerer.springframework.context;

import com.zerer.springframework.beans.factory.HierarchicalBeanFactory;
import com.zerer.springframework.beans.factory.ListableBeanFactory;
import com.zerer.springframework.core.io.ResourceLoader;

/**
 * @author zhuangjw
 * @description:
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
