package com.zijie.feishu.utils;

/**
 * ����ʱ���
 */
public class TimeStamp {
    public static long getCurrentTimeStampForLong(){
       long currentTimeStamp=System.currentTimeMillis();
       return currentTimeStamp;
    }
    public static String getCurrentTimeStampForString(){
       String  currentTimeStamp=String.valueOf(System.currentTimeMillis());
       return currentTimeStamp;
    }
    
}
