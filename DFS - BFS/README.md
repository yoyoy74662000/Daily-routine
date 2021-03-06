# DFS & BFS
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
|51|[N-Queens](https://leetcode.com/problems/n-queens/) | [Java]()|Hard|09/02|很難 backtracking|
|52|[N-Queens II](https://leetcode.com/problems/n-queens-ii/) | [Java]()|Hard|09/02|很難 backtracking|
|127|[Word Ladder](https://leetcode.com/problems/word-ladder/) | [Java]()|Medium|09/02|很難 backtracking|
|130|[Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) | [Java]()|Medium|09/02|backtracking|
|200|[Number of Islands](https://leetcode.com/problems/number-of-islands/) | [Java]()|Medium|09/02|backtracking|
|286|[Walls and Gates](https://leetcode.com/problems/walls-and-gates/) | [Java]()|Medium|09/02|backtracking|
|339|[Nested List Weight Sum](https://leetcode.com/problems/nested-list-weight-sum/) | [Java]()|Easy|09/03|dfs helper|
|364|[Nested List Weight Sum II](https://leetcode.com/problems/nested-list-weight-sum-ii/) | [Java]()|Medium|09/03|dfs 先求深度，再計算|
