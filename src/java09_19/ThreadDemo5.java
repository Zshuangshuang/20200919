package java09_19;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:15:58
 **/
public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread thread = new Thread("这是一个新线程，它的名字可以很长"){
            @Override
            public void run(){
                while(true){

                }
            }
        };
        thread.start();
    }
}
