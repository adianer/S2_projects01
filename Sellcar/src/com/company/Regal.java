package com.company;

import com.company.Car;

public class Regal extends Car{
    public Regal(){

    }
    public Regal(String id ,String type){
        super(id,type);
    }
    public void sell(){
        System.out.println("卖了出一辆"+getType());
    }
}

