public class Mythread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<=10;i++){
            System.out.println("value of i is:"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    public static void main(String[] args){
        Mythread t1=new Mythread();
        Thread th=new Thread(t1);
        th.start();
    }
    
}
