package SeasonTwo.ch01;

public class HelloStatic {
    public static void main(String[] args) {

        //使用类名直接调用静态方法
        HelloStatic.print();
        System.out.println(hobby);
        print();

        //也可以通过对象名调用
        HelloStatic helloStatic_test = new HelloStatic();
        helloStatic_test.print();

        //通过对象名调用普通成员方法
        helloStatic_test.show();

    }

    //声明普通成员变量
    String name = "爱慕课";
    //声明静态成员变量
    static String hobby = "Java大神";

    //使用static关键字声明静态方法
    public static void print(){
        System.out.println("这是个静态方法");
        HelloStatic helloStatic_test = new HelloStatic();
        System.out.println("静态方法直接访问静态成员变量:" + hobby );
        System.out.println("静态方法直接访问普通成员变量:" + helloStatic_test.name );
    }


    public void show(){
        System.out.println("普通成员方法直接访问静态变量:" + hobby);
        System.out.println("普通成员方法直接访问静态变量:" + name);
    }
}
