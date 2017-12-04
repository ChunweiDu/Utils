package com.dcw.tool.utils;

import android.support.annotation.Nullable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * 数据处理工具
 */

public class DataUtil {

    /**
     * KB与Byte的倍数
     */
    private static final int KB = 1024;
    /**
     * MB与Byte的倍数
     */
    private static final int MB = 1048576;
    /**
     * GB与Byte的倍数
     */
    private static final int GB = 1073741824;

    /**
     * 判断字符串是否为空 为空即true
     *
     * @param str 字符串
     * @return
     */
    public static boolean isNullString(@Nullable String str) {
        return str == null || str.length() == 0 || "".equals(str) || "null".equals(str);
    }


    /**
     * 字节数转合适大小
     * <p>保留3位小数</p>
     *
     * @param byteNum 字节数
     * @return 1...1024 unit
     */
    public static String byte2FitSize(long byteNum) {
        if (byteNum < 0) {
            return "shouldn't be less than zero!";
        } else if (byteNum < KB) {
            return String.format(Locale.getDefault(), "%.3fB", (double) byteNum);
        } else if (byteNum < MB) {
            return String.format(Locale.getDefault(), "%.3fKB", (double) byteNum / KB);
        } else if (byteNum < GB) {
            return String.format(Locale.getDefault(), "%.3fMB", (double) byteNum / MB);
        } else {
            return String.format(Locale.getDefault(), "%.3fGB", (double) byteNum / GB);
        }
    }


    /**
     * 隐藏字符串末尾
     *
     * @param string 传入的字符串
     * @param count  传入的显示的字符长度
     * @return 返回处理好的字符串
     */
    public static String hideEndString(String string, int count) {
        int length = string.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                builder.append("*");
            } else {
                builder.append(string.substring(0, count));
            }
        }
        return builder.toString();
    }

    /**
     * 隐藏字符串中间字符
     *
     * @param string 传入的字符串
     * @return
     */
    public static String hideMiddleString(String string) {
        int length = string.length();
        int email = length - 6;
        int num = (email - 4) / 2;
        if (email < 4) {
            return string;
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append(string.substring(0, num));
            for (int i = 0; i < length; i++) {
                if (i >= num && i < (num + 4)) {
                    builder.append("*");
                }
            }
            builder.append(string.substring(num + 4, length));
            return builder.toString();
        }
    }

    /**
     * inputStream转byteArr
     *
     * @param is 输入流
     * @return 字节数组
     */
    public static byte[] inputStream2Bytes(InputStream is) {
        return input2OutputStream(is).toByteArray();
    }

    /**
     * inputStream转outputStream
     *
     * @param is 输入流
     * @return outputStream子类
     */
    public static ByteArrayOutputStream input2OutputStream(InputStream is) {
        if (is == null)
            return null;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            byte[] b = new byte[KB];
            int len;
            while ((len = is.read(b, 0, KB)) != -1) {
                os.write(b, 0, len);
            }
            return os;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            FileUtil.closeIO(is);
        }
    }
}
