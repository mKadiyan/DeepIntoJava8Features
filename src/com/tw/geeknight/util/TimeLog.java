package com.tw.geeknight.util;

public class TimeLog {
    public static void code(Runnable runnable){
        long start  =System.nanoTime();
        try{
            runnable.run();
        }finally {
            long end = System.nanoTime();
            System.out.println("Time Taken(s) : "+(end-start)/1.0e9);
        }
    }
}
