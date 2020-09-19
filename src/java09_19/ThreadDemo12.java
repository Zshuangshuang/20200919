package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:17:28
 **/
public class ThreadDemo12 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是线程1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                }

        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是线程2");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

        };
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}
