import java.util.Scanner;

public abstract class  vehicle {
    public String brand="";

    public String no="";
    public  int day;
    public int free;
    public  vehicle(String brand){
        this.brand=brand;
    }
    public  vehicle(){
        System.out.println("欢迎来到汽车租赁公司");
        System.out.println("请输入要租赁的天数：");
        Scanner ip=new Scanner(System.in);
        int day=ip.nextInt();
        System.out.println("请输入要租赁的汽车类型：（1、轿车；2、客车）");
        int xuanze =ip.nextInt();
        switch (xuanze){
            case 1:
                car ca=new car(day);
                break;
            case 2:
                bus bu=new bus(day);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public  vehicle(int day){
        this.day=day;
        System.out.print("请选择要租赁的汽车品牌：(");
    }
    public void host(){
        System.out.println("你的租金是"+day*free+"元");
    }
    public void   type(){
        System.out.print("请选择要租赁的");
    }

}
final class  car extends vehicle{
    public  String type;
    public String free;
    public  enum  bie{
        商务,林荫大道
    };
    public  car(){

    }
    public  car(int day){
        super(day);
        System.out.print("1、宝马；2、别克)");
       Scanner ip=new Scanner(System.in);
        int xuanze =ip.nextInt();
        String type ="";
        switch (xuanze){
            case 1:
                super.type();
                System.out.print("汽车型号：(1、550i；2、730)");
                xuanze=ip.nextInt();
                switch (xuanze){
                    case 1:
                        super.free=500;
                        break;
                    case 2:
                        super.free=800;
                        break;
                }
                break;
            case 2:
                super.type();
                System.out.print("汽车型号：(1、商务；2、林荫)");
                xuanze=ip.nextInt();

                switch (xuanze){
                    case 1:
                        super.free=600;
                        break;
                    case 2:
                        super.free=300;
                        break;
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        super.host();
    }
}
final class  bus extends vehicle{
    public  String type;
    public String free;
    public  enum  bie{
        金龙,金杯
    };
    public  bus(int day){
        super(day);
        System.out.print("1、金杯；2、金龙)");
        Scanner ip=new Scanner(System.in);
        int xuanze =ip.nextInt();
        seat();
    }
    public void seat(){
        System.out.println("请输入需要的座位数");
        Scanner ip=new Scanner(System.in);
        int count =ip.nextInt();
        if (count>16){
            super.free=1500;
        }else if(count>0){
            super.free=800;
        }
        super.host();
    }
}