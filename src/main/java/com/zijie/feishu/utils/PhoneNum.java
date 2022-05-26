package com.zijie.feishu.utils;

/**
 * 生成随机号码
 */
public class PhoneNum {
    public static String getPhoneNum() {
        //给予真实的初始号段，号段是在百度上?查找的真实号段
        String[] start = {"133", "149", "153", "173", "177",
                "180", "181", "189", "199", "130", "131", "132",
                "180", "181", "189", "199", "130", "131", "132",
                "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "172",
                "178", "182", "183", "184", "187", "188", "198", "170", "171"};

        //随机出真是号段，使用数据的length属性，获得数组长度
        //通过Math.random() *数组长度获得数组下标，从而随机出前三位的号段
        String phoneFirstNum = start[(int) (Math.random() * start.length)];
        //随机出剩下的8位数
        String phoneLastNum = "";
        //定义尾号，尾号是8位
        final int LENPHONE = 8;
        //循环剩下的位数
        for (int i = 0; i < LENPHONE; i++) {
            //每次循环都从0~9挑选?个随机数
            phoneLastNum += (int) (Math.random() * 10);
        }
        //最终将号段和尾数连接起来
        String phoneNum = phoneFirstNum + phoneLastNum;
        return phoneNum;


    }
}
