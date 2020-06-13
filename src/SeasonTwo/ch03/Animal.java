package SeasonTwo.ch03;

public class Animal {
    public int age = 10;
    private int sex;
    public String name;
    public void eat(){
        System.out.println("动物具有吃东西的能力");
    }

    /**
     * 初始化，即相当于执行类的构造方法
     * 继承的初始化顺序
     * 1、初始化父类再初始化子类
     * 2、先执行初始化对象中属性，再执行构造方法中的初始化
     * 3、总结，每次先执行父类的属性初始化，再执行父类的构造方法，再执行子类的属性初始化
     * 再执行子类的构造方法
     */
    public Animal(){
        System.out.println("Animal类执行了");
        age = 20;
    }

}






