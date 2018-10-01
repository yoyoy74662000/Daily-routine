# Stack & PriorityQueue

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
|84|[Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | [Java]()|Hard|09/05|有點難 Stack背起來 |
|155|[Min Stack](https://leetcode.com/problems/min-stack/) | [Java]()|Easy|09/04|用兩個 stack|
|215|[Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | [Java]()|Medium|09/05|Priority queue 有別於一般的 queue，每一個 element 都額外帶有優先值，愈優先的 (一般來說是優先值愈低的) 放在愈前面。|
|224|[Basic Calculator](https://leetcode.com/problems/basic-calculator/) | [Java]()|hard|09/04|背起來|
|225|[Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | [Java]()|Easy|09/04|for迴圈裡面 先remove 再add 剛剛remove的|
|232|[Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | [Java]()|Easy|09/04|兩個stack 先加在同一個stack，然後 pop then push to 另一個stack |
|341|[Flatten Nested List Iterator](https://leetcode.com/problems/flatten-nested-list-iterator/) | [Java]()|Medium|09/05|stack，用到一些 getInteger() or getList()|
|346|[346 Moving Average from Data Stream](https://leetcode.com/problems/moving-average-from-data-stream) | [Java]()|Easy|10/01|Queue|
|347|[Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | [Java]()|Medium|09/06|stackS 很難|
|394|[Decode String](https://leetcode.com/problems/decode-string/) | [Java]()|Medium|09/05|兩個stack 背起來 |
