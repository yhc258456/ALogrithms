package com.rachel.alogrithm;


public class KmpTest {

    public static void main(String[] args) {
        String testStr = "eu0ifjasifdasofjajgnaklfq0294u0wjfdsjfi2r9jdsf4asedf" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllll" +
                "5fwefjwehfwohfhosdfodsfdsfsdfndsfsdfndskfndskflsdfnsdlfndslfndsfldsnfldsnfdsllllllllllhyhc";
        KmpTest kmpTest = new KmpTest();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            kmpTest.search(testStr, "yhc"); // 1000 104ms
//            kmpTest.strStr(testStr, "yhc");  // 1000 24ms
        }
        System.out.println(testStr.length() - 3);
        System.out.println("花费时间： " + (System.currentTimeMillis() - start) + "ms");

    }

    public int search(String str, String target) {
        int step = target.length();
        for (int i = 0; i < str.length(); i++) {
            int end = i + step;
            if (end <= str.length()) {
                if (target.equals(str.substring(i, end))) return i;
            }
        }

        return -1;
    }


    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

}

