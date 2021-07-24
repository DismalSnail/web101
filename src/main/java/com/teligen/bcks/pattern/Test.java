package com.teligen.bcks.pattern;

/**
 * @author 冶鹏豪
 * @date 2021/7/21
 */
public class Test {
    public static void main(String[] args) {
        Subject subjectProxy = new SubjectProxy(new RealSubject());
        subjectProxy.request();
    }
}
