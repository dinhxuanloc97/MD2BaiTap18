package Bai3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization("tim so nguyen to" ,51);
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization(100,"tim tat ca so nguyen to ");
        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(op);
        thread1.start();
        System.out.println("");
        thread2.start();
    }
}
