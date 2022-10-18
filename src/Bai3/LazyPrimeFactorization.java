package Bai3;

public class LazyPrimeFactorization implements Runnable {

    private String name ;
    private int number;

    public LazyPrimeFactorization() {
    }

    public LazyPrimeFactorization(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean is_prime = true;
        if (this.number == 0 || this.number == 1){
            is_prime = false;
        }
        for (int i = 0; i <= this.number-1 ; i++) {
            if (this.number % 1 == 0){
                is_prime = false;
                break;
            }
        }
        if (is_prime){
            System.out.println(this.number+"la so nguyen to ");
        }else {
            System.out.println(this.number+"khong la 1 so nguyen to ");
        }

    }
}
