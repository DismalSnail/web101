package com.teligen.bcks.pattern;

/**
 * @author 冶鹏豪
 * @date 2021/7/21
 */
public class SubjectProxy implements Subject{
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    private void doBefore(){
        System.out.println("Do before");
    }

    private void doAfter(){
        System.out.println("Do after");
    }

    @Override
    public void request() {
        doBefore();
        subject.request();
        doAfter();
    }
}
