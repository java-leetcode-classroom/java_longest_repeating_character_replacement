import java.util.HashMap;

public class Solution {
  public int characterReplacement(String s, int k) {
    int maxLen = 0, sLen = s.length(), left = 0;
    int count = 0;
    HashMap<Character, Integer> freq = new HashMap<>();
    for (int right = 0; right < sLen; right++) {
      char ch = s.charAt(right);
      int cFreq = freq.containsKey(ch)? freq.get(ch):0;
      freq.put(ch, cFreq+1);
      if (cFreq+1 > count) {
        count = cFreq +1;
      }
      if (right - left + 1 - count > k) {
        char lchar = s.charAt(left);
        int lcFreq = freq.get(lchar);
        freq.put(lchar, lcFreq-1);
        left++;
      }
      maxLen = Math.max(maxLen, right - left +1);
    }
    return maxLen;
  }
}
