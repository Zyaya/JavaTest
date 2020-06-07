package SeasonOne;

public class CharTest {

    public static void main(String[] args) {
        //char型单引号扩起来
        char he = 'z';
        System.out.println(he);
        System.out.println(String.valueOf(he));

        System.out.println(Character.MAX_VALUE);
        System.out.println((char) 2147483647);
        System.out.println("男");

        int[] score= new int[]{3,5,6,6,7,8};
        int score2[]=new int[]{3,4,5,6};

        int[][] two = new int[2][3];
        System.out.println(two.length);
        System.out.println(two[1].length);
    }
}
