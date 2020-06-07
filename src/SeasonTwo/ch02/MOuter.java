package SeasonTwo.ch02;

public class MOuter {

    //外部类中的方法
    public void show() {
        final int a = 25;
        int b = 13;

        //方法内部类
        class MInner {
            int c = 2;

            public void print() {
                System.out.println("访问外部类的方法中的常量a:" + a);
                System.out.println("访问外部类的方法中的常量a:" + c);
            }
        }
    }
}
