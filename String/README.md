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
|9|[Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java]()|Easy|08/07||
|12|[Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | [Java]()|Medium|08/07|StringBuilder|
|13|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [Java]()|Easy|08/07||
|14|[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java]()|Easy|08/07|使用indexOf|
|20|[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java]()|Easy|08/07|Stack & else if (stack.isEmpty() || stack.pop() != c)return false;|
|22|[Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | [Java]()|Medium|08/07|ArrayList and Recursion|
|28|[Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [Java]()|Easy|08/08|substring equals()|
|49|[Group Anagrams](https://leetcode.com/problems/group-anagrams/) | [Java]()|Medium|08/08|先ArrayList then HashMap 再 toCharArray 再 sort  再 new String|
|58|[Length of Last Word](https://leetcode.com/problems/length-of-last-word) | [Java]()|Easy|09/23|轉成array by split(" ")|
|91|[Decode Ways](https://leetcode.com/problems/decode-ways/) | [Java]()|Medium|09/23|dp形式|
|93|[Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | [Java]()|Medium|09/23|backtracking|
|125|[Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | [Java]()|Easy|08/08|使用isLetterOrDigit，if else 判斷頭尾|
|131|[Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | [Java]()|Medium|08/08|Backtracking one helper and isPalindrome()|
|151|[Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | [Java]()|Medium|08/08|split("\\s+")|
|161|[One Edit Distance](https://leetcode.com/problems/reverse-words-in-a-string/) | [Java]()|Medium|08/08|split("\\s+")|
|186|[Reverse Words in a String II](https://leetcode.com/problems/reverse-words-in-a-string-ii/) | [Java]()|Medium|09/23|做三次 reverse 第一個是整句，第二個是word，第三個是 最後一個字|
|227|[Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) | [Java]()|Medium|09/24|使用stack|
|242|[Valid Anagram](https://leetcode.com/problems/one-edit-distance/) | [Java]()|Medium|08/09|substring 去比較|
|266|[Palindrome Permutation](https://leetcode.com/problems/palindrome-permutation/) | [Java]()|Easy|08/09|HashSet|
|271|[Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/) | [Java]()|Medium|09/24|先用StringBuilder 再去 substring|
|293|[Flip Game](https://leetcode.com/problems/flip-game/) | [Java]()|Easy|09/24|類似two pointer前後一樣，就用substring|
|344|[Reverse String](https://leetcode.com/problems/reverse-string/) | [Java]()|Easy|08/09|swap then String.valueOf(r)|
|345|[Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | [Java]()|Easy|09/24|類似two pointer，再做swap|
|383|[Ransom Note](https://leetcode.com/problems/ransom-note/) | [Java]()|Easy|09/24|先count++，再 --count|
|387|[First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | [Java]()|Easy|09/25|先算freq，再看是否有1的|
|657|[Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin) | [Java]()|Easy|10/01|if else|
