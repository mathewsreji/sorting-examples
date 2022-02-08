package com.reji.sort;

public class LargestPalindrome {
    public static void main(String[] args) {
        System.out.println(new LargestPalindrome().longestPalindrome("Believe it or not, there are even some complete sentences (and even a few questions!) that are palindromes. Most, but not all, examples of sentence palindromes are quite brief.\n" +
                "\n"));
    }

    public String longestPalindrome(String data) {
        if (data.length() == 0 || data.length() == 1) {
            return data;
        }

        // A B C B A
        // A B C C B A

        String result = "";
        String checkType = "element";
        for (int i = 0; i < data.length() - 2; i++) {
            String pivotalPalindrome = pivotalPalindromeCheck(data, i);
            if (pivotalPalindrome.length() > result.length()) {
                result = pivotalPalindrome;
            }
        }

        return result;

    }

    private String pivotalPalindromeCheck(String data, int i) {
        int beginIndex = i;
        int endIndex = i;
        for (int j = 1; j < data.length() - i  ; j++) {
            try {
                if (data.charAt(i - j) == data.charAt(i + j)) {
                    beginIndex = i - j;
                    endIndex = i + j;
                } else {
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        String result = data.substring(beginIndex, endIndex + 1);
        return result;
    }

    /*private void gapPalindromeCheck(String data, int i) {
        for (int j = 0; j < data.length() / 2; j++) {

        }
    }*/
}
