package com.company;

import java.util.Scanner;

public class Seller {
    private String name;

    public void sell(Excelle e){
        System.out.println(this.name+"卖了一辆"+e.getType());
    }
    public void sell(Regal e){
        System.out.println(this.name+"卖了一辆"+e.getType());
    }
    public void sell(Car e ,int i){
        System.out.println(this.name+"卖了"+i+"辆"+e.getType());
    }
    public  void select(){
        System.out.println("请选择要购买的车辆类型:1、凯越。2、君威");
        Scanner ip=new Scanner(System.in);
        int i=ip.nextInt();
        Car car=new Car();
        switch (i){
            case 1:
                car=new Excelle("京AG6182","凯越");
                break;
            case 2:
               car=new Regal("京AG6182","君威");
                break;
        }
        System.out.println("是否购买多辆：1、是。2、否");
        int j=ip.nextInt();
        switch (j){
            case 1:
                System.out.println("请输入购买数量");
                int k=ip.nextInt();
                System.out.print(this.name);
                car.sell(k);
                break;
            case 2:
                System.out.print(this.name);
               car.sell();
                break;
        }}
        public void sum(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
