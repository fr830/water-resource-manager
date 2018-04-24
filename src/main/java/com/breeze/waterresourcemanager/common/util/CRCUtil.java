package com.breeze.waterresourcemanager.common.util;

/**
 * Created by yinyong on 2018/4/24.
 * CRC16校验码工具类
 */
public class CRCUtil {
    /**
     * 根据传入的字符串生成对应的CRC16校验码
     * @param massage 待生成校验码的字符串
     * @return CRC16校验码
     */
    public static String getCRC(String massage) {
        int i, j, crc_reg, check;
        char[] msg = massage.toCharArray();
        crc_reg = 0xFFFF;
        for (i = 0; i < msg.length; i++) {
            crc_reg = (crc_reg >> 8) ^ msg[i];
            for (j = 0; j < 8; j++) {
                check = crc_reg & 0x0001;
                crc_reg >>= 1;
                if (check == 0x0001) {
                    crc_reg ^= 0xA001;
                }
            }
        }
        return Integer.toHexString(crc_reg);
    }

    public static void main(String[] args) {
        String msg ="QN=20160801085857223;ST=21;CN=1062;PW=123456;MN=A220582_0001;Flag=9;CP=&&RtdInterval=10&&";
        System.out.println(getCRC(msg)); //e381
    }
}
