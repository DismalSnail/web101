package com.teligen.bcks.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 冶鹏豪
 * @date 2021/7/20
 */
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringContextUtils.context=context;
    }
    public static ApplicationContext getContext(){
        return context;
    }
}
