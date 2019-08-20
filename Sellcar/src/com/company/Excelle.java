package com.company;
import com.company.Car;
public class Excelle extends Car {
    public Excelle(){

    }
    public Excelle(String id ,String type){
        super(id,type);
    }
    public void sell(){
        System.out.println("卖出了一辆"+getType());
    }
}
