package SeasonThree;

public class DrunkExceptionTest {

    public void divide(int one, int two) throws DrunkException {
        if (two == 0)
            throw new DrunkException("DrunkException test");
        else
            System.out.println("result: " + one/two);
    }

    public void divide2(int one, int two) throws DrunkException{
        System.out.println("result: " + one/two);
    }

    //调用别的类的方法抛出了异常，自己也要“抓住”或再抛出。JAVA的异常处理机制要求的。
    //不抛DrunkException的话，会报Unhandled exception type 异常
    //调用别的类的方法抛出了异常，自己也要“抓住”或再抛出。JAVA的异常处理机制要求的。
    //divide这个方法在方法声明上已经声明了会抛异常,那么在调用这个方法回的时候,就必须做异常处理,处理的方式有2种,要么try-catch这个异常,要么继续往上一层抛出这个异常,这是java语法要求的,必须这么做
    public static void main(String[] args) throws DrunkException {
       DrunkExceptionTest drunkExceptionTest = new DrunkExceptionTest();
       drunkExceptionTest.divide(0,1);
      // test.divide(1,0);
       DrunkException de = new DrunkException("hh");
       de.divide(1,0);
    }


}
