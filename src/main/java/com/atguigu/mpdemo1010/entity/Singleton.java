package com.atguigu.mpdemo1010.entity;

/**
 * @author wujun
 * @Description
 * @date 2022-02-27 11:15
 */
public class Singleton {
    private Singleton() {
    }

    private volatile static Singleton singleton;

    public static Singleton getInstance(){
        synchronized (Singleton.class){
            if (singleton == null){
              singleton = new Singleton();
            }
        }
        return singleton;
    }
}

class test{
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
