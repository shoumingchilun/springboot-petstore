package com.example.springbootpetstore.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @auther 齿轮
 * @create 2023-03-20-19:47
 */
public class Hash {

    public static String SHA256Encrypt(String sourceStr) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (null != md) {
            md.update(sourceStr.getBytes());
            String digestStr = getDigestStr(md.digest());
            return digestStr;
        }

        return null;
    }
    private static String getDigestStr(byte[] origBytes) {
        String tempStr = null;
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < origBytes.length; i++) {
            tempStr = Integer.toHexString(origBytes[i] & 0xff);
            if (tempStr.length() == 1) {
                stb.append("0");
            }
            stb.append(tempStr);

        }
        return stb.toString();
    }
}
