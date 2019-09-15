package com.zyl.design_model.simpleFactory;

public class SimpleFactory {
    public Product createProduct(int type){
        if(type==1){
            return new ConcreteProduct1();
        }else if(type==2){
            return new ConcreteProduct2();
        }else{
            return new ConcreteProduct();
        }
    }

}
