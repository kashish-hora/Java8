class userthread extends Thread{
    public void run(){
        System.out.println("this is a new task");
    }
}
class Threadop{
    public static void main(String[] args){
        System.out.println("program started");
        int sum=56+90;
        System.out.println("sum is:"+sum);
        //Thread
        Thread t=Thread.currentThread();
        String tname=t.getName();
        System.out.println("current running thread is:"+tname);
        t.setName("mymain");
        System.out.println("new name of thread is:"+t.getName());
        System.out.println("thread id is:"+t.getId());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//going to start user defined thread
userthread thread=new userthread();
thread.start();
        System.out.println("program ended");

    }
}