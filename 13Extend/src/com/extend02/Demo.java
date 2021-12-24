package com.extend02;

/*
    测试类
    继承中成员变量的访问规则遵循就近原则
    先访问子类，再访问父类
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Zi z = new Zi();
        z.show();
    }
}
