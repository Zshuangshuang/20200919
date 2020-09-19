package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:16:39
 **/
public class ThreadDemo7 {
    private static boolean isQuit = false;
    public static void main(String[] args) {
        Thread thread = new Thread(){
          @Override
          public void run(){
                while (!isQuit){
                    System.out.println("别烦我，我在忙！");
                    try{
                        Thread.sleep(5);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
              System.out.println("忙好了(*^__^*) ");
          }
        };
        thread.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("你遇到骗子了");
        isQuit = true;
    }
}
