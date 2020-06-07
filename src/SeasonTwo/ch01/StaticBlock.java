package SeasonTwo.ch01;

public class StaticBlock {
    int num1;
    int num2;
    static int num3;
    //构造方法
    public StaticBlock(){
        num1 = 91;
        System.out.println("通过构造方法为num1赋值:" + num1);
    }
    //初始化块
    {
        num2 = 74;
        num3 = 87; //可以为静态变量赋值
        System.out.println("通过初始化块为num2赋值:" + num2);
        System.out.println("通过初始化块为num3赋值:" + num3);
    }

    static {
        num3 = 84;
        System.out.println("通过静态初始化块为num3赋值:" + num3);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println("num1:" + sb.num1);
        System.out.println("num2:" + sb.num2);
        System.out.println("num3:" + num3);
        StaticBlock sb2 = new StaticBlock();
    }
}
