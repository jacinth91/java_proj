package Programe;

import java.math.BigInteger;

public class Factorial implements Runnable{

    int num;

    public Factorial(int num){
        this.num = num;
    }
    @Override
    public void run() {
        BigInteger result1 = factorial();
        System.out.println(" num : "+this.num+" is assigned to thread : "+Thread.currentThread().getName()+ " the result "+result1);

    }
    public  BigInteger factorial(){
        BigInteger result = BigInteger.ONE;
        for(int i = 2;i <=this.num ;i ++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
