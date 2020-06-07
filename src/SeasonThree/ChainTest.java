package SeasonThree;

public class ChainTest {


    /**
     * test1()，抛出"喝大了"异常
     * test2()，捕获"喝大了"异常，并且包装成运行时异常，继续抛出
     * main方法中，调用test2()，尝试捕获test2()方法抛出异常
     * @param args
     */
    public static void main(String[] args) {
        ChainTest ct = new ChainTest();
        try{
            ct.test2();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            ct.test3();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //因为方法里抛出了个异常，所以必须在声明时向上抛出异常
    public void test1() throws DrunkException {
        throw new DrunkException("喝酒别开车");
    }

    public void test2(){
        try {
            test1();
        }catch (DrunkException e){
            //以下为写法一
           RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪");
           //引用了原始异常，从而实现异常链
           newExc.initCause(e);
           throw newExc;
        }
    }

    public void test3(){
        try{
            test1();
        }catch (DrunkException e){
            RuntimeException newExc = new RuntimeException(e);
            newExc.initCause(e);
            throw newExc;
        }
    }
}
