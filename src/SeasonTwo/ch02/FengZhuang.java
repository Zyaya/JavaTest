package SeasonTwo.ch02;

public class FengZhuang {

    public float getCpu() {
        //调用当前对象的某个方法
        this.sendMessage();
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
        //去掉this，则默认为0，赋值失败
    }

    private float cpu;

    public void sendMessage(){
        System.out.println("sendMessage");
    }

}
