package SeasonTwo.ch01;

//1.定义一个类
public class Telphone {
    //2.属性（成员变量/实例变量）有什么
    float screen;
    float cpu;
    float mem;

    //3.方法 干什么
    void call(){
        System.out.println("Telphone有打电话的功能");
    }

    void sendMessage(){
        System.out.println("Telphone具有发短信的功能");
    }

    public Telphone(){
        System.out.println("无参的构造方法执行了 ");
    }

    public Telphone(float newScreen,float newCpu,float newMem){
        screen = newScreen;
        cpu = newCpu;
        mem = newMem;
        System.out.println("有参的构造方法执行了 ");
    }
}
