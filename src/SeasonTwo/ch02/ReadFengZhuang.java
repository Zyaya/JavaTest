package SeasonTwo.ch02;

public class ReadFengZhuang {

    public static void main(String[] args) {
        FengZhuang fz = new FengZhuang();
        //只能通过set方法或其他定义好的方法给属性赋值
        fz.setCpu(8.8f);
        System.out.println("cpu:" + fz.getCpu());
    }
}
