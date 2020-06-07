package SeasonTwo.ch01;

public class InitialTelphone {

    public static void main(String[] args) {
        Telphone phone = new Telphone();
        phone.sendMessage();
        //给实例变量赋值
        phone.screen = 5.0f;
        phone.cpu = 1.4f;
        phone.mem = 2.0f;
        //调用对象的方法
        phone.sendMessage();
        Telphone phone2 = new Telphone(7.0f,8.0f,9.0f);
    }
}
