package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:15:47
 **/
public class ThreadDemo4 {
    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("我是一个Thread!");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.run();
    }
}
