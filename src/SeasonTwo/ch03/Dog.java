package SeasonTwo.ch03;

import SeasonTwo.ch03.Animal;

/**
 * 子类直接继承父类的属性和方法，但是父类的private属性不能继承
 */
public class Dog extends Animal {

    /**
     * 重写，返回值类型、方法名、参数都要一样
     */
    public void eat(){
        System.out.println("年龄：" + age + "狗是可以吃东西的");
    }
    public Dog(){
        System.out.println("Dog类执行了");
    }
}

