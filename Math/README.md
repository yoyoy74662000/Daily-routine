# Math
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
|1|[Two Sum](https://leetcode.com/problems/two-sum/) | [Java]()|Easy|08/11|Hashmap 因為 HashSet 無法使用 get()|
|2|[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [Java]()|Medium|08/10|dummy and two pointer|
|7|[Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [Java]()|Easy|08/10||
|8|[String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | [Java]()|Medium|08/10||
|9|[Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java]()|Easy|08/10||
|15|[3Sum](https://leetcode.com/problems/3sum/) | [Java]()|Medium|08/11|先 Arrays.sort() 再 類似pointer 前後 相加是否等於低一個數字|
|18|[4Sum](https://leetcode.com/problems/4sum/) | [Java]()|Medium|08/12|類似 3sum 要記住|
|66|[Plus One](https://leetcode.com/problems/plus-one/) | [Java]()|Easy|08/10|考慮進位|
|67|[Add Binary](https://leetcode.com/problems/add-binary/) | [Java]()|Easy|08/10|使用 x.charAt(s) - '0';|
|69|[Sqrt(x)](https://leetcode.com/problems/sqrtx/) | [Java]()|Easy|08/10|binary search|
|167|[Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | [Java]()|Easy|08/10|just like two sum|
|204|[Count Primes](https://leetcode.com/problems/count-primes/) | [Java]()|Easy|08/11||
|258|[Add Digits](https://leetcode.com/problems/add-digits/) | [Java]()|Easy|08/10||
|453|[Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements) | [Java]()|Easy|10/01||
