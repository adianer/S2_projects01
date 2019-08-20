
public class Pet {
    private  String name="";
    private  int health=100;
    private int love=0;

    public  Pet(){
        this.setHealth(90);
    }

    public  Pet (String name){
        this.setName(name);
    }
    public  Pet (String name,int health){
        this.setName(name);
        this.setHealth(health);
    }

    public  Pet (String name,int health,int love){
        this.setName(name);
        this.setHealth(health);
        this.setLove(love);
    }

    public void print(){
        System.out.print("我叫"+ this.getName() +",我的健康值是"+ this.getHealth() +"，亲密度是"+ this.getLove()+"；");
    }
    public abstract void eat(){

    }
    public  viod adopt(){
        System.out.println("欢迎领养宠物");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
