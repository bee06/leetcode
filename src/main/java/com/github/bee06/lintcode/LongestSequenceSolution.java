/*
* Copyright (c) 17/9/27 foo.com. All Rights Reserved.
*/
package com.github.bee06.lintcode;

import java.util.HashSet;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 * <p>
 * 给定一个未排序的整数数组，找到最长连续元素序列的长度。
 * <p>
 * 例如， 给定[100, 4, 200, 1, 3, 2]， 最长的连续元素序列是[1, 2, 3, 4]。返回长度：4。
 * <p>
 * 您的算法应该以O（n）的复杂度运行。
 *
 * @author: z Date: 17/9/27 Time: 下午7:59
 * @version: 1.0.0
 */
public class LongestSequenceSolution {

    public static void main(String[] args) {
        int[] numberList = {100, 101, 200, 102, 103, 104};

        System.out.println(longestConsecutive(numberList));
    }

    public static int longestConsecutive(int[] numberList) {

        if (numberList == null || numberList.length == 0) {
            return -1;
        }

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < numberList.length; i++) {
            hs.add(numberList[i]);
        }

        int max = 0;
        for (int i = 0; i < numberList.length; i++) {
            if (hs.contains(i)) {
                int count = 1;
                hs.remove(numberList[i]);

                int low = numberList[i] - 1;
                while (hs.contains(low)) {
                    hs.remove(low);
                    low--;
                    count++;
                }

                int high = numberList[i] + 1;
                while (hs.contains(high)) {
                    hs.remove(high);
                    high++;
                    count++;
                }
                max = Math.max(max, count);
            }

        }

        return max;
    }

}
