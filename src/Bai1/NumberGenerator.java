package Bai1;

public class NumberGenerator implements  Runnable{

    private Thread myThread;

    public NumberGenerator(){
        myThread = new Thread(this,"Dem so tu nhien ");
        myThread.start();
    }
    public Thread getMyThread(){
        return myThread;
    }



    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("in ra so " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("luong bi ran doan ");
        }
        System.out.println("luong ket thuc ");

    }
}
