package module02_session08.thucHanh1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("pic");

        Dog dog1 = new Dog("becgie","red");
        Dog dog2 = new Dog("pug","whittle");

        Cat cat1 = new Cat("Dora");

        System.out.println("tên động vật là " + animal.getName());
        animal.setName("Cac");
        System.out.println("tên động vật là " + animal.getName());
        dog1.setName("VIp pro");
        System.out.println("tên động vật là " + dog1.getName()+ "màu lông : " + dog1.getColor() + " sua" + dog1.makeSound());



    }
}
