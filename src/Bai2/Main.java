package Bai2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread("So chan ");
        OddThread oddThread = new OddThread("so le");
        System.out.println("so le la ");
        evenThread.start();
        evenThread.join();
        System.out.println("so chan la :");
        oddThread.start();
    }
}
