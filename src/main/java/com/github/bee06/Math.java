/*
* Copyright (c) 17/9/20 foo.com. All Rights Reserved.
*/
package com.github.bee06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: z Date: 17/9/20 Time: 下午2:59
 * @version: 1.0.0
 */
public class Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String ss = s.replace(" ", "");
            int length = ss.length();
            int k = sc.nextInt();
            char[] cs = ss.toCharArray();
            Arrays.sort(cs);
            for (int i = 0; i < k - 1; i++) {
                System.out.print(cs[i] + " ");
            }
            System.out.println(cs[k - 1]);

            for (int i = cs.length - 1, j = 0; i >= 0 && j < k - 1; i--, j++) {
                System.out.print(cs[i] + " ");
            }
            System.out.print(cs[cs.length - k]);

        }

    }
}
