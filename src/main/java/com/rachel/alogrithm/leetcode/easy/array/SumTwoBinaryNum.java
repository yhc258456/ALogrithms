package com.rachel.alogrithm.leetcode.easy.array;

/**
 * @author rachel
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class SumTwoBinaryNum {

    public static void main(String[] args) {
        String num = sumTwoBinaryNum("1111", "1111");
        System.out.println(num);
        num = sumTwoNum("5", "6", 10);
        System.out.println(num);

    }

    /**
     * 二进制求和
     *
     * @return
     */
    public static String sumTwoBinaryNum(String a, String b) {
        int hex = 2;
        String sum = "";
        int isAddOne = 0;
        int aLen = a.length();
        int bLen = b.length();
        for (int i = aLen - 1, j = bLen - 1; i >= 0 && j >= 0; i--, j--) {
            int intA = Integer.parseInt(String.valueOf(a.charAt(i)));
            int intB = Integer.parseInt(String.valueOf(b.charAt(j)));
            if (intA + intB + isAddOne == hex) {
                sum = aLen == bLen && i == 0 ? "10" + sum : "0" + sum;
                isAddOne = 1;
            }
            else if (intA + intB + isAddOne == hex + 1) {
                sum = aLen == bLen && i == 0 ? "11" + sum : "1" + sum;
                isAddOne = 1;
            }
            else {
                sum = intA + intB + isAddOne + "" + sum;
                isAddOne = 0;
            }
        }
        for (int i = Math.max(aLen, bLen) - Math.min(aLen, bLen) - 1; i >= 0; i--) {
            int intC = Integer.parseInt(String.valueOf(aLen > bLen ? a.charAt(i) : b.charAt(i)));
            if (intC + isAddOne == hex) {
                sum = i == 0 ? "10" + sum : "0" + sum;
                isAddOne = 1;
            }
            else if (intC + isAddOne == hex + 1) {
                sum = i == 0 ? "11" + sum : "1" + sum;
                isAddOne = 1;
            }
            else {
                sum = intC + isAddOne + "" + sum;
                isAddOne = 0;
            }
        }
        return sum;
    }

    /**
     * 官方解答
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    public static String sumTwoNum(String a, String b, int hex) {
        String sum = "";
        int isAddOne = 0;
        int aLen = a.length();
        int bLen = b.length();
        for (int i = aLen - 1, j = bLen - 1; i >= 0 && j >= 0; i--, j--) {
            int intA = Integer.parseInt(String.valueOf(a.charAt(i)));
            int intB = Integer.parseInt(String.valueOf(b.charAt(j)));
            if (intA + intB + isAddOne == hex) {
                sum = aLen == bLen && i == 0 ? "10" + sum : "0" + sum;
                isAddOne = 1;
            }
            else if (intA + intB + isAddOne == hex + 1) {
                sum = aLen == bLen && i == 0 ? "11" + sum : "1" + sum;
                isAddOne = 1;
            }
            else {
                sum = intA + intB + isAddOne + "" + sum;
                isAddOne = 0;
            }
        }
        for (int i = Math.max(aLen, bLen) - Math.min(aLen, bLen) - 1; i >= 0; i--) {
            int intC = Integer.parseInt(String.valueOf(aLen > bLen ? a.charAt(i) : b.charAt(i)));
            if (intC + isAddOne == hex) {
                sum = i == 0 ? "10" + sum : "0" + sum;
                isAddOne = 1;
            }
            else if (intC + isAddOne == hex + 1) {
                sum = i == 0 ? "11" + sum : "1" + sum;
                isAddOne = 1;
            }
            else {
                sum = intC + isAddOne + "" + sum;
                isAddOne = 0;
            }
        }
        return sum;
    }

}
