package com.teligen.bcks.pattern;

/**
 * @author 冶鹏豪
 * @date 2021/7/21
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("I am RealSubject");
    }
}
