package SeasonThree;

public class TryCatchTest {

    public static void main(String[] args) {

        TryCatchTest tct = new TryCatchTest();
        int result = tct.test();
        System.out.println("test()方法执行完毕");
        int result2 = tct.test2();
        System.out.println("test2()方法执行完毕");
        int result3 = tct.test3();
        System.out.println("result3:" + result3);

    }

    public int test(){

        int divider = 10;
        int result = 100;

        try{
            while(divider > -1){
                divider --;
                result = result + 100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return -1;
        }
    }

    public int test2(){
        int divider = 10;
        int result = 100;

        try{
            while(divider > -1){
                divider --;
                result = result + 100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return result = 999;
        }finally {
            System.out.println("这是finally方法");
            System.out.println("result" + result);
            return result = 999;
        }
    }

    //如果try或catch或finally语句块中没有return，则调用最后的return
    public int test3(){
        int divider = 10;
        int result = 100;

        try{
            while(divider > -1){
                divider --;
                result = result + 100/divider;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了");

        }finally {
            System.out.println("这是finally方法");
            System.out.println("result" + result);
        }
        System.out.println("我是test3");
        return 1111;

    }
}
