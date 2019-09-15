package com.zyl.design_model.singleton;

/**
 * 懒汉式 线程不安全
 */
public class Singleton01 {
    private static Singleton01 uniqueInstance;

    private Singleton01(){}

    public static Singleton01 getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton01();
        }
        return uniqueInstance;
    }

}
