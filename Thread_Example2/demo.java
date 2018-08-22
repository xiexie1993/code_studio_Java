
/**
 * 线程一
 */
class Thread1 extends Thread{
    // Object lock = new Object();
    // @Override
    /**
     * 一个耗时运算
     */
    private static Object lock = new Object();
    
    private static void slow(){
        int i = 0,j = 0, k = 0,n = 0;
        while (i++ < 999999){
            while(j++< 999999){
                while(k++<99999){
                    n++;
                }
            }
        }
    }

    public void run(){
        try{
            synchronized(lock){
            slow();
            lock.wait();
            Thread.sleep(1500);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}



/**
 * 线程二
 */
class Thread2 extends Thread{
    private static Object lock = new Object();
    
    // @Override
    /**
     * 一个耗时运算
     */
    private static void slow(){
        int i = 0,j = 0, k = 0,n = 0;
        while (i++ < 999999){
            while(j++< 999999){
                while(k++<99999){
                    n++;
                }
            }
        }
    }
    public void run(){
        synchronized(lock){
            slow();
            lock.notify();
        }
    }
}
/**
 * 主程序
 */
public class demo {
    // public Object lock = new Object();
    // private Object lock = new Object();
    private static Object lock = new Object();
    /**
     * 格式化打印线程状态
     */
    // private static void print(){
    //     System.out.format("t1:%-15s t2%-15s \n".toLowerCase()，t1.getState(),t2.getState());
    // }
   // public static void main(String[] args)
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();

        // print();
        System.out.format("t1:%-15s t2:%-15s \n".toLowerCase(),t1.getState(),t2.getState());

        t1.start();
        // print();
        System.out.format("t1:%-15s t2:%-15s \n".toLowerCase(),t1.getState(),t2.getState());
        t2.start();

        // 定时打印线程状态
        while(t1.getState() != Thread.State.TERMINATED){
            // print();
            System.out.format("t1:%-15s t2:%-15s \n".toLowerCase(),t1.getState(),t2.getState());
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}


