package SeasonThree;

public class DrunkException extends Exception{

    //保留是为了可以初始化一个DrunkException()的对象
    //否则 DrunkException de = new DrunkException()会报错
    //如果不保留，那么初始化一个对象时，必须是 new DrunkException("XXXX")才不报错
    public DrunkException(){}


    //构造方法
    public DrunkException(String message){
        super(message);
    }

    public void divide(int one, int two) throws DrunkException{
        if (two == 0)
            throw new DrunkException("an DrunkException");
        else
            System.out.println("result: " + one/two);
    }

    public static void main(String[] args) throws DrunkException{
        DrunkException de = new DrunkException();
        de.divide(1,0);
    }


}
