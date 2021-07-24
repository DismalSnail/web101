package com.teligen.bcks.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 冶鹏豪
 * @date 2021/7/21
 */
public class MyProxy {
    public interface IHello {
        void sayHello();
        void sayGreet();
    }

    static class Hello implements IHello {
        @Override
        public void sayHello() {
            System.out.println("Hello World");
        }

        @Override
        public void sayGreet() {
            System.out.println("Greets");
        }


    }

    static class MyInvocationHandler implements InvocationHandler {
        private Object target;

        public MyInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before");
            Object invoke = method.invoke(target, args);
            System.out.println("after");
            return invoke;
        }
    }

    public static void main(String[] args) {
        IHello iH = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),
                new Class[]{IHello.class},
                new MyInvocationHandler(new Hello()));
        iH.sayHello();
        iH.sayGreet();
    }
}
