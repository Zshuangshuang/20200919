package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:16:08
 **/
public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread thread = new Thread("蔡徐坤"){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                  try{
                      Thread.sleep(1000);
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
                }
                System.out.println("线程结束！");
            }
        };
        //不会改变
        System.out.println(thread.getName());

        System.out.println(thread.getPriority());
        System.out.println(thread.isDaemon());
        System.out.println(thread.getId());
        //会改变
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.isInterrupted());


        thread.start();
        while(thread.isAlive()){
            System.out.println("蔡徐坤线程正在运行");
            System.out.println(thread.getState());
            System.out.println(thread.isInterrupted());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
