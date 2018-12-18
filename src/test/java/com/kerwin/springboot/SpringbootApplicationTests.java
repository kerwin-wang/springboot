package com.kerwin.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests
{

    private ThreadLocal<Long> integerThread = new ThreadLocal<>();

    private ThreadLocal<String> stringTread = new ThreadLocal<>();

    private void set(){
        integerThread.set(Thread.currentThread().getId());

        stringTread.set(Thread.currentThread().getName());
    }

    private long getInt(){
        return integerThread.get();
    }

    private String getString(){
        return stringTread.get();
    }

    @Test
    public void contextLoads() throws InterruptedException
    {
        set();
        System.out.println(getInt());
        System.out.println(getString());

        Thread thread1 = new Thread(() -> {
            set();
            System.out.println(getInt());
            System.out.println(getString());
        });
        thread1.start();

        thread1.join();

        System.out.println(getInt());
        System.out.println(getString());
    }

}
