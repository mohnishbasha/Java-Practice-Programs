/*
Read:
http://www.geeksforgeeks.org/count-distinct-subsequences/

Count Distinct Subsequences
Given a string, find count of distinct subsequences of it.

Examples:

Input  : str = "gfg"
Output : 7
The seven distinct subsequences are "", "g", "f",
"gf", "fg", "gg" and "gfg"

Input  : str = "ggg"
Output : 4
The six distinct subsequences are "", "g", "gg"
and "ggg"
We strongly recommend that you click here and practice it, before moving on to the solution.

The problem of counting distinct subsequences is easy if all characters of input string are distinct. The count is
equal to nC0 + nC1 + nC2 + … nCn = 2n.

How to count distinct subsequences when there can be repetition in input string?
A Simple Solution to count distinct subsequences in a string with duplicates is to generate all subsequences. For every
subsequence, store it in a hash table if it doesn’t exist already. Time complexity of this solution is exponential and
it requires exponential extra space.

An Efficient Solution doesn’t require generation of subsequences.

Let countSub(n) be count of subsequences of
first n characters in input string. We can
recursively write it as below.

countSub(n) = 2*Count(n-1) - Repetition

If current character, i.e., str[n-1] of str has
not appeared before, then
   Repetition = 0

Else:
   Repetition  =  Count(m)
   Here m is index of previous occurrence of
   current character. We basically remove all
   counts ending with previous occurrence of
   current character.
How does this work?
If there are no repetitions, then count becomes double of count for n-1 because we get count(n-1) more subsequences by
adding current character at the end of all subsequences possible with n-1 length.

If there repetitions, then we find count of all distinct subsequences ending with previous occurrence. This count can be
 obtained be recursively calling for index of previous occurrence.

Since above recurrence has overlapping subproblems, we can solve it using Dynamic Programming.

Below is C++ implementation of above idea.


Time Complexity : O(n)
Auxiliary Space : O(n)

 */



public class CountDistinctSubSequence {

    // C++ program to count number of distinct
    // subsequences of a given string.

    #include <bits/stdc++.h>
    using namespace std;
    const int MAX_CHAR = 256;

    // Returns count of distinct sunsequences of str.
    int countSub(string str)
    {
        // Create an array to store index
        // of last
        vector<int> last(MAX_CHAR, -1);

        // Length of input string
        int n = str.length();

        // dp[i] is going to store count of distinct
        // subsequences of length i.
        int dp[n+1];

        // Empty substring has only one subsequence
        dp[0] = 1;

        // Traverse through all lengths from 1 to n.
        for (int i=1; i<=n; i++)
        {
            // Number of subsequences with substring
            // str[0..i-1]
            dp[i] = 2*dp[i-1];

            // If current character has appeared
            // before, then remove all subsequences
            // ending with previous occurrence.
            if (last[str[i-1]] != -1)
                dp[i] = dp[i] - dp[last[str[i-1]]];

            // Mark occurrence of current character
            last[str[i-1]] = (i-1);
        }

        return dp[n];
    }

    // Driver code
    int main()
    {
        cout << countSub("gfg");
        return 0;
    }


}