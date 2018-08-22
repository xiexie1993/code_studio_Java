class First extends Thread{
    //写一个类执行十次随机时间休眠
        @Override
        public void run() {
        try {
            for(int i=0;i<10;i++)
            {
                int time =(int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("当前线程是  "+Thread.currentThread().getName()); 
            }
            }
            catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
}
public class demo extends First{
    public static void main(String[] args) {
        try {
            First thread = new First();
            thread.setName("new Thread");
            thread.start();
            for(int i=0;i<10;i++)
            {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("当前线程是  "+Thread.currentThread().getName());
            } 
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


