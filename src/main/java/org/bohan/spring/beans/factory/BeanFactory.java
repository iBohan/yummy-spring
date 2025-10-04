package org.bohan.spring.beans.factory;

import org.bohan.spring.beans.BeansException;

public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 根据bean名称和类型获取bean
     *
     * @param beanName
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}
