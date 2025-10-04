package org.bohan.spring.beans.support;

import org.bohan.spring.beans.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例注册中心，获取bean
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 缓存单例对象 bean name --> bean instance
     */
    private Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    /**
     * 获取单列bean
     * @param beanName
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        // todo 先不实现循环依赖的处理
        return singletonObjects.get(beanName);
    }
}
