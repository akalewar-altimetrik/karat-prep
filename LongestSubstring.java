// Time Complexity is O(n) since each character is visited at most twice.
// Space Complexity is O(n) in worst case becasuse if all are unique characters in then set stores all.

import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
