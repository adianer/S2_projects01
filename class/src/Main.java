import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Pet pet=new Pet("11");
        pet.print();
        Dog dog=new Dog("狗狗","中华田园犬");
        dog.print();
        Penguin penguin=new Penguin("囡囡","Q妹");
        penguin.print();
    }

}

