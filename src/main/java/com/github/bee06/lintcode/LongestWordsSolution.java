/*
* Copyright (c) 17/9/11 foo.com. All Rights Reserved.
*/
package com.github.bee06.lintcode;

import java.util.ArrayList;

/**
 * 给一个词典，找出其中所有最长的单词。
 * @author: z Date: 17/9/11 Time: 上午10:43
 * @version: 1.0.0
 */
public class LongestWordsSolution {

    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    static ArrayList<String> longestWords(String[] dictionary) {
        // write your code here

        if (dictionary.length < 1) {
            return new ArrayList<String>();
        }

        ArrayList<String> result = new ArrayList<String>();

        int maxLen = 0;

        // 取出最大的
        for (int i = 0; i < dictionary.length; i++) {

            String temp = dictionary[i];

            if (maxLen <= temp.length()) {
                maxLen = temp.length();
            }

        }

        // 和最大的相等
        for (int i = 0; i < dictionary.length; i++) {

            String temp = dictionary[i];

            if (maxLen == temp.length()) {
                result.add(temp);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String[] string = new String[]{"rysbaimzmw",
                "bwvsarfznafszpmbsdqjsqnuhtoqekdshiuormiozxjsuidzhvitldauilxvynaetvoxowrzyxuiytqhcembt",
                "rcmtgteohakeew", "sjxefeceltjxisulhopvochjqxqqxiqq",
                "ulxnrmbmejdsbgmanlkgfmzfygaakrrierxvjbqyciznkbhxkzkvjbusfisyuepcdjdtiskclzalnpxfzocffxudvmrk",
                "drzbkjz", "vnjbasjtxnfuiommvgftsainrfetlbdfrwirzuuhgrcxpuqpro",
                "hkjxrboyeolvckiynxzaiyzlwekusisehcvpznlwiifecnwzzvuxggppuqlgytwrdsyxud",
                "xtxjtoewummlzrsxzygfpohmkonehtvkmfxiwsuemtrkfbqysjvmohrcxjvwxzppzwdnhiqtvopfijyuofg",
                "cbnrfvxehbqhfhzwpsntudawqkmsofawtrgvvxqosqvzfaufvudcgjlwjsocyjblujak",
                "wftbsbleeastdecakpfdvofytskdoodcsdkoxbqhftzlncfvflcmpgagbnhlqsqjqembgbeeiixzxntsfofazeltl",
                "dgwfqljiqgtevokbh", "xmhryjtbepkpdrwzzoqumerwjopthhlknfcsgjynkkitamrtdnalmoeu",
                "xpgqetlkfzlojkkjhpvhpbhhzkdnskqaqipuexrmawnynxbeymdlxksyhuysstuvkxdulnqpx",
                "urkugtmwaokjviyytphlpvjuravnxtcn",
                "fsehtgfdsmikhftokrqvyyqoic",
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam",
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam",
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam",
                "mybrlqusbxegpyjikvzdyjaypigstfthygpvaizcmcaqmeno", "doehqsjbfqswhrvowgrqayn",
                "plernkkrtvtmi"};

        String[] string1 = new String[]{
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam",
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam",
                "gceanuhttirobmeoizapnfgmpmvzrqxetnsinfhrtonsnybizmiewtahsadjyoeidrpuutqhwotznrggnvjqfnlxagam"};


        ArrayList<String> strings1 = LongestWordsSolution.longestWords(string1);

        for (String s : strings1) {

            System.out.println(s);
        }


    }
}
