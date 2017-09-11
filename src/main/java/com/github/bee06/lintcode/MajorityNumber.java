/*
* Copyright (c) 17/9/11 foo.com. All Rights Reserved.
*/
package com.github.bee06.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: z Date: 17/9/11 Time: 下午4:40
 * @version: 1.0.0
 */
public class MajorityNumberSolution {

    /*
    * @param nums: a list of integers
    * @return: find a  majority number
    */
    public static int majorityNumber(List<Integer> nums) {
        // write your code here

        if (nums == null || nums.size() < 1) {
            return -1;
        }

        int oneHalfSize = nums.size() / 2;

        if (nums.size() % 2 != 0) {
            oneHalfSize = nums.size() / 2 +1;
        }


        int count = 0;

        Integer temp = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {

            Integer integer = nums.get(i);

            if (temp == integer) {
                count++;
            }

            if (count >= oneHalfSize) {
                return temp;
            }


            if (temp != integer) {
                temp = integer;
                count = 1;
            }


        }

        return temp;
    }

    public static void main(String[] args) {

        Integer[] integers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};



        int i = majorityNumber(Arrays.asList(integers));

        System.out.println(i);
    }
}
