/*
* Copyright (c) 17/9/23 foo.com. All Rights Reserved.
*/
package com.github.bee06.strings;

/**
 * @author: z Date: 17/9/23 Time: 上午10:05
 * @version: 1.0.0
 */
public class Math1 {

    /**
     * 求一个字符串
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "Hello Zhang Cheng ";
        String str2 = "Cheng Zhang Hello ";

        System.out.println(getLCSLength(str1, str2));
        System.out.println(getLCSLength2(str1, str2));
    }

    /**
     * 获取两个字符串最长公共子串长度
     *
     * @param str  第一个字符串
     * @param str2 第二个字符串
     * @return 如果存在则返回最长公共子串长度，否则返回0
     */
    public static int getLCSLength(String str, String str2) {
        char[] ary = str.toCharArray();
        char[] ary2 = str2.toCharArray();

        int[][] temp = new int[ary.length][ary2.length];    //声明一个二维数组，存储最长公共子串长度
        int length = 0; //最长公共子串长度
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary2.length; j++) {
                if (ary[i] == ary2[j]) {
                    if (i > 0 && j > 0) {
                        temp[i][j] = temp[i - 1][j - 1] + 1;
                    } else {
                        temp[i][j] = 1;
                    }

                    if (temp[i][j] > length) { //当前元素值大于最大公共子串长度
                        length = temp[i][j];
                    }
                } else {
                    temp[i][j] = 0;
                }
            }
        }
        return length;
    }

    /**
     * 获取两个字符串最长公共子串长度
     *
     * @param str  第一个字符串
     * @param str2 第二个字符串
     * @return 如果存在则返回最长公共子串长度，否则返回0
     */
    public static int getLCSLength2(String str, String str2) {
        char[] ary = str.toCharArray();
        char[] ary2 = str2.toCharArray();

        int[][] temp = new int[ary.length][ary2.length];    //声明一个二维数组，存储最长公共子串长度
        int length = 0; //最长公共子串长度

        for (int i = 0; i < ary2.length; i++) {    //初始化二维矩阵中的第一行
            temp[0][i] = (ary[0] == ary2[i]) ? 1 : 0;
        }

        for (int j = 1; j < ary.length; j++) { //初始化二维矩阵中的第一列
            temp[j][0] = (ary2[0] == ary[j]) ? 1 : 0;
        }

        for (int i = 1; i < ary.length; i++) {
            for (int j = 1; j < ary2.length; j++) {
                if (ary[i] == ary2[j]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;

                    if (temp[i][j] > length) { //当前元素值大于最大公共子串长度
                        length = temp[i][j];
                    }
                } else {
                    temp[i][j] = 0;
                }
            }
        }
        return length;
    }
}
