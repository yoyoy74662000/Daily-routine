# String

# Time Complexy Cheat Sheet

|Data Structure | Time  |        |           |        |       |        |           |        |           Space  |
|:-------------:|:-----:|:------:|:---------:|:------:|:-----:|:------:|:---------:|:------:|:----------------:|
|               |Average|        |           |        | Worst |        |           |        | Worst            |
|               |Indexing | Search | Insertion | Delete |Indexing | Search | Insertion | Delete |                  |
| Basic Array   | O(1)  | O(n)   |     -      | -  | O(1)  | O(n)   | -      | -          | O(n)             |
| Dynimic Array | O(1)  | O(n)   | O(n)      | O(n)   | O(1)  | O(n)   | O(n)      | O(n)   | O(n)             |
| Stack         | O(n)  | O(n)   | O(1)      | O(1)   | O(n)  | O(n)   | O(1)      | O(1)   | O(n)             |
| Queue         | O(n)  | O(n)   | O(1)      | O(1)   | O(n)  | O(n)   | O(1)      | O(1)   | O(n)             |
|Single LinkedList| O(n)  | O(n)   | O(1)      | O(1)   | O(n)  | O(n)   | O(1)      | O(1)   | O(n)             |
|Double LinkedList| O(n)  | O(n)   | O(1)      | O(1)   | O(n)  | O(n)   | O(1)      | O(1)   | O(n)             |
| Hash Table    | N/A  | O(1)   | O(1)      | O(1)   | N/A  | O(n)   | O(n)      | O(n)   | O(n)             |
| BST           | O(logN)  | O(logN)    | O(logN)  | O(logN) | O(n)  | O(n)   | O(n)      | O(n)   | O(n)    |
| Red Black Tree| O(logN)  | O(logN) | O(logN) | O(logN)  | O(logN)  | O(logN) | O(logN) | O(logN)   | O(n)      |
| AVL Tree      | O(logN)  | O(logN) | O(logN) | O(logN)  | O(logN)  | O(logN) | O(logN) | O(logN)   | O(n)      |


| # | Title | Solution | Difficulty | Date | 使用 |
|---| ----- | -------- | ---------- |------|------|
|3|[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Java]()|Medium|08/07|HashSet > HashMap|
|5|[Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | [Java]()|Medium|08/07|中心點 left--, right++ 去看兩側有沒有一樣|
|12|[Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | [Java]()|Medium|08/07|StringBuilder|
|13|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [Java]()|Easy|08/07||
|14|[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java]()|Easy|08/07|使用indexOf|
|20|[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java]()|Easy|08/07|Stack & else if (stack.isEmpty() || stack.pop() != c)return false;|
|22|[Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | [Java]()|Medium|08/07|ArrayList and Recursion|
|28|[Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [Java]()|Easy|08/08|substring equals()|
|49|[Group Anagrams](https://leetcode.com/problems/group-anagrams/) | [Java]()|Medium|08/08|先ArrayList then HashMap 再 toCharArray 再 sort  再 new String|
|125|[Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | [Java]()|Easy|08/08|使用isLetterOrDigit|
|131|[Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | [Java]()|Medium|08/08|Backtracking one helper and isPalindrome()|
|242|[Valid Anagram](https://leetcode.com/problems/valid-anagram/) | [Java]()|Easy|08/08|Arrays.sort() then Arrays.equals()|
