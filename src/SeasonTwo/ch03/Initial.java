package SeasonTwo.ch03;

public class Initial {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("animal age:" + animal.age);
        /**
         * 创建子类对象时，会优先创建父类对象
         */
        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "dog";
        dog.eat();
    }
}
