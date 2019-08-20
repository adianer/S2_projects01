public class Penguin extends Pet{
    private String sex;
    private  final String SEX_MALE="Q仔";
    private  final String SEX_FEMALE="Q妹";
    public  Penguin(String name,String sex){
        super(name);
        this.sex=sex;
    }
    public String getSex(){
        return  sex;
    }
    public void print(){
        System.out.println();
        super.print();
        System.out.println("我是"+this.sex);
    }

    public void setSex(int i) {
        if (i==1){
            this.sex=SEX_MALE;
        }else {
            this.sex=SEX_FEMALE;
        }
    }
}



