package com.rachel.alogrithm.leetcode.easy.array;

/**
 * @author rachel
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * <p>
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FigureOutLastWordLength {

    public static void main(String[] args) {
        int len = figureOutLastWordLength("a desc ");
        System.out.println(len);
    }

    /**
     * 最后一个单词的长度
     *
     * @return
     */
    public static int figureOutLastWordLength(String word) {
        if (word != null && word.length() > 0) {
            int maxIndex = word.length() - 1;
            // 从后往前找到第一个空格
            while (word.charAt(maxIndex) == ' ') {
                maxIndex--;
            }
            // 从第一个空格往前开始找到第一个不为空格的字符
            int wordLen = 0;
            while (maxIndex >= 0 && word.charAt(maxIndex) != ' ') {
                wordLen++;
                maxIndex--;
            }
            return wordLen;
        }
        return 0;
    }

}
