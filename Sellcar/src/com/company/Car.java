package com.company;

public class Car {
    private String type;
    private  String id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Car(){
        this.type=type;
        this.id=id;
    }
    public Car(String id ,String type){
        this.type=type;
        this.id=id;
    }
    public void sell(){
        System.out.println("卖出了一辆"+getType());
    }
    public void sell(int i){
        System.out.println("卖出了"+i+"辆"+getType());
    }
}
