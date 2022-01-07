package com.abstract03;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal b = new Animal() {
            @Override
            public void eat() {

            }
        };
        Animal a = new Cat();
        a.eat();
        a.show();
    }
}
