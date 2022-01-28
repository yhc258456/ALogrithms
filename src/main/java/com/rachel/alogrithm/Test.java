package com.rachel.alogrithm;

public class Test {

    public static void main(String[] args) {
        int x = 49;
        int sqlrX = mySqrtMyself(x);
        System.out.println(x + " 的算术平方根的整数部分是：" + sqlrX);
    }

    /**
     * 二分法求解非负整数的平方根并去尾小数
     *
     * @param x
     * @return
     */
    public static int mySqrtMyself(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                ans = mid;
                // 这里为啥要 +1
                l = mid + 1;
            } else {
                // 这里为啥要 -1
                r = mid - 1;
            }
        }
        return ans;
    }


    /**
     * 二分法求解非负整数的平方根并去尾小数
     * 官方解答
     *
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
