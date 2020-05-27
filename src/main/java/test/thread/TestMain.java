package test.thread;

public class TestMain {
    public static void main(String[] args) {
       /* new TestThread().start();
        System.out.println(Thread.currentThread().getName());*/
        TestThread2 my = new TestThread2();//定义 Runnable 子类对象
        Thread t = new Thread(my,"线程");//实例化 Thread 对象
        System.out.println("线程开始执行之前 --> " + t.isAlive());//判断是否启动

        t.start();//启动线程
        System.out.println("线程开始执行之后 --> " + t.isAlive());//判断是否启动

        for (int i=0;i<3;i++){//循环输出 3 次
            System.out.println("main 运行 -->" + i);//输出
        }
        System.out.println("代码执行之后 --> " + t.isAlive());//后面的输出不确定
    }
}
