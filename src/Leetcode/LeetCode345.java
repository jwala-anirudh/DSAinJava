package Leetcode;

public class LeetCode345 {

    // Approach 1
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private void swap(char[] values, int left, int right) {
        char temp = values[left];
        values[left] = values[right];
        values[right] = temp;
    }

    String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] values = s.toCharArray();

        while (left < right) {
            // find the leftmost vowel
            while (left < s.length() && !isVowel(values[left])) {
                ++left;
            }

            // find the rightmost vowel
            while (right >= 0 && !isVowel(values[right])) {
                --right;
            }

            // swap them
            if (left < right) {
                swap(values, left, right);
                ++left;
                --right;
            }
        }

        return new String(values);
    }

    // Approach 2
    public String reverseVowels2(String str) {
        final String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder(str);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            while (
                    start < end &&
                            !vowels.contains("" + sb.charAt(start))
            ) {
                ++start;
            }

            while (
                    start < end &&
                            !vowels.contains("" + sb.charAt(end))
            ) {
                --end;
            }

            // Swap in string build using input string "str"
            sb.setCharAt(start, str.charAt(end));
            sb.setCharAt(end, str.charAt(start));

            ++start;
            --end;
        }

        return sb.toString();
    }
}