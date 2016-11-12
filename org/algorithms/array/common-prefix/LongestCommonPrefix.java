/*
Read:
http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/

Must Read:
http://www.geeksforgeeks.org/longest-common-prefix-set-1-word-by-word-matching/

http://www.geeksforgeeks.org/longest-common-prefix-set-4-binary-search/




Problem

Write a function to find the longest common prefix string amongst an array of strings.

Analysis

To solve this problem, we need to find the two loop conditions. One is the length of the shortest string.
The other is iteration over every element of the string array.


 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        if(strs.length==1)
            return strs[0];

        int minLen = strs.length+1;

        for(String str: strs){
            if(minLen > str.length()){
                minLen = str.length();
            }
        }

        for(int i=0; i<minLen; i++){
            for(int j=0; j<strs.length-1; j++){
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i)!=s2.charAt(i)){
                    return s1.substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }

    /*
    Simple Algorithm Will Go Like This:

    Algorithm: Longest Common Prefix ( LCP)
    1.Take a String From Array Whose length is Minimum else you might get exception if tries to access array element
    outside range.why this will work because if there exist a common prefix then it will be the desired answer .

    Example like in case of "shash" ,"shank","shashank" LCP will be "sha"
            for this string "ab", "abc", "def" ,"defgh", "sha" LCP will be NULL

    2.Keep Comparing reamining string character by character with 1st selected string  if mismatch occurs at any position i then append 1st string to output string.


      Time Complexity O(N*M-1)=O( Where N is Length of 1st Smallest String
            and M is Number of remaining string in string array so it will run
            upto length of array-1
            Space Complexity O(1)

    */

    String findLongPrefix(String [] str)
    {
        StringBuilder strBuilder = new StringBuilder();

        char [] firstStr = str[0].toCharArray();

        for(int i = 0; i < str[0].length(); i++ ) {

            boolean found = true;

            for(String str: str) {
                if(str.charAt(i) != firstStr[i]) {
                    found = false;
                    break;
                }
            }

            if(found) {
                strBuilder.append(firstStr[i]);
            } else
                break;

        }

        return strBuilder.toString();
    }



}