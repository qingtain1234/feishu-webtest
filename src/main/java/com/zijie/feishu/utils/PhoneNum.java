package com.zijie.feishu.utils;

/**
 * �����������
 */
public class PhoneNum {
    public static String getPhoneNum() {
        //������ʵ�ĳ�ʼ�ŶΣ��Ŷ����ڰٶ���?���ҵ���ʵ�Ŷ�
        String[] start = {"133", "149", "153", "173", "177",
                "180", "181", "189", "199", "130", "131", "132",
                "180", "181", "189", "199", "130", "131", "132",
                "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "172",
                "178", "182", "183", "184", "187", "188", "198", "170", "171"};

        //��������ǺŶΣ�ʹ�����ݵ�length���ԣ�������鳤��
        //ͨ��Math.random() *���鳤�Ȼ�������±꣬�Ӷ������ǰ��λ�ĺŶ�
        String phoneFirstNum = start[(int) (Math.random() * start.length)];
        //�����ʣ�µ�8λ��
        String phoneLastNum = "";
        //����β�ţ�β����8λ
        final int LENPHONE = 8;
        //ѭ��ʣ�µ�λ��
        for (int i = 0; i < LENPHONE; i++) {
            //ÿ��ѭ������0~9��ѡ?�������
            phoneLastNum += (int) (Math.random() * 10);
        }
        //���ս��Ŷκ�β����������
        String phoneNum = phoneFirstNum + phoneLastNum;
        return phoneNum;


    }
}
