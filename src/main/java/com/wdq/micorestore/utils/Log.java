package com.wdq.micorestore.utils;

public class Log {
    private static boolean show=true;
    public static void e(String msg){
        if(show)
        System.out.println(msg);
    }
    public static void e(String tag,String msg){
        if(show)
        System.out.println(tag+":"+msg);
    }
}
