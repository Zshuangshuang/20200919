package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:16:48
 **/
public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
          @Override
          public void run(){
            while (Thread.currentThread().isInterrupted()){
                System.out.println("我在忙");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();

                }
            }
              System.out.println("忙好了");
          }
        };
        thread.start();

        Thread.sleep(500);
        thread.interrupt();
        System.out.println("他是骗子");
        thread.interrupt();
    }
}
