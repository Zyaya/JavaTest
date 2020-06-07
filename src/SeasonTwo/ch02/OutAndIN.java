package SeasonTwo.ch02;

/**
 * 成员内部类
 */
public class OutAndIN {

    String b = "out";
    public class Inner{
        String b = "in";
        public void show(){
            System.out.println("It belongs to inner class");
        }

        /**
         * 遇到同名变量，内部类默认优先调用内部类的成员变量
         * 如果需要调用外部成员变量，可以使用this关键字
         */
       public void test(){
           System.out.println("调用外部类的对象b:" + OutAndIN.this.b);
           System.out.println("调用内部类的对象b:" + b);
       }

    }
    //外部类不能直接调用内部类的方法，需要自己new一个内部类对象，然后再去调用
    public void print(){
        Inner i = this.new Inner();
        i.show();
    }

    public static void main(String[] args) {
        OutAndIN oai = new OutAndIN();
        oai.print();
        //利用外部类的对象去new一个内部类对象
        Inner in = oai.new Inner();
        in.show();
        in.test();
    }

}
