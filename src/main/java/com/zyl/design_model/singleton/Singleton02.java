package com.zyl.design_model.singleton;

/**
 * 静态内部类实现
 * 具备延迟初始化以及由JVM提供了线程安全的支持
 */
public class Singleton02 {
    private Singleton02(){}

    private static class SingletonHolder{
        private static final Singleton02 INSTANCE = new Singleton02();
    }

    public static Singleton02 getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
