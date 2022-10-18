package Bai1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator count = new NumberGenerator();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child threa is live ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Bi dan doan ");
        }
        System.out.println("luong ket thuc ");
    }

}
