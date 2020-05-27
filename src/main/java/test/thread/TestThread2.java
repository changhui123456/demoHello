package test.thread;

public class TestThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()
                    + "运行 --> " + i);//取得当前线程的名称
        }
    }
}
