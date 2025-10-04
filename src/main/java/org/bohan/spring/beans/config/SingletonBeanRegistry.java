package org.bohan.spring.beans.config;

/**
 * 单例的方式管理注册bean中心
 */
public interface SingletonBeanRegistry {


    Object getSingleton(String beanName);

}
