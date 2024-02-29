package Programe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialClient {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] arr2 = new Integer[]{100000,200000,300000,400000,500000};
        long start_time = System.currentTimeMillis();
        List<Thread> list = new ArrayList<>();
        Arrays.stream(arr2).forEach(i->{
            Factorial factorial = new Factorial(i);
            Thread thread = new Thread(factorial);
            thread.start();
            list.add(thread);
        });

        list.stream().forEach(i ->{
            try {
                i.join();
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        });

        long end_time = System.currentTimeMillis();
        System.out.println("time taken :"+(end_time-start_time));
    }

}
