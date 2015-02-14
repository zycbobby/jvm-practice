package jp.co.worksap;

/**
 * Created by zuo on 15-2-14.
 */
public class Program {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        for (;;i++) {
            Thread.sleep(3000);
            System.out.println(i);
        }
    }
}
