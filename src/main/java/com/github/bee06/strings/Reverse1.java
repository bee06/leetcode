/*
* Copyright (c) 17/9/20 foo.com. All Rights Reserved.
*/
package com.github.bee06.strings;

/**
 * @author: z Date: 17/9/20 Time: 下午9:24
 * @version: 1.0.0
 */
public class Reverse1 {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(reverse("abdswerty", 2, 4));
        System.out.println(System.currentTimeMillis() - l);

        long l1 = System.currentTimeMillis();
        System.out.println(reverse2("abdswerty", 2, 4));
        System.out.println(System.currentTimeMillis() - l1);
    }

    public static String reverse(String string, int start, int end) {

        char[] chars = string.toCharArray();

        // 最后一位
        int finish = end + 1;

        while (finish > start) {

            char temp = chars[start];

            for (int j = start + 1; j < finish; j++) {
                chars[j - 1] = chars[j];
            }
            chars[finish - 1] = temp;

            finish--;
        }

        return String.valueOf(chars);
    }

    private static String reverse2(String string, int start, int end) {

        char[] chars = string.toCharArray();

        int mid = (end - start) / 2 + start;

        for (int i = 0; i < mid - start; i++) {
            swap(chars, start + 1, end - 1);
        }

        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

    }
}
