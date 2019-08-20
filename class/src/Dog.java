
//werwerwerewr
public class Dog extends Pet{
        private String strain;
        public  Dog(String name,String strain){
            super(name);
            this.strain=strain;
        }
        public String getStrain(){
            return  strain;
        }
        public void print(){
            System.out.println();
            super.print();
            System.out.println("我是一只"+this.strain);
        }
        public void eat(){
            System.out.println();
    }
    }


