public class Main {
    public static void main(String [] args){
        Company com=new Company();
        Consumer c=new Consumer(com);
        Producer p=new Producer(com);
        p.start();
        c.start();
    }
    
}
