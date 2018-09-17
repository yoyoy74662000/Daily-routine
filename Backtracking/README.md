# Backtracking
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
|31|[Next Permutation](https://leetcode.com/problems/next-permutation/) | [Java]()|Medium|09/07|swap and reverse|
|39|[Combination Sum](https://leetcode.com/problems/combination-sum/) | [Java]()|Medium|09/16|記住helper(,,,,start)|
|40|[Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | [Java]()|Medium|09/16|記住要加一個if條件以免重複helper(,,,,start+1)|
|46|[Permutations](https://leetcode.com/problems/permutations/) | [Java]()|Medium|09/16|記住helper if()continue|
|47|[Permutations II](https://leetcode.com/problems/permutations-ii/) | [Java]()|Medium|09/16|記住helper 用boolean[] use 看是否有重複使用|
|77|[Combinations](https://leetcode.com/problems/combinations/) | [Java]()|Medium|09/16|記住helper 類似combination sum II|
|78|[Subsets](https://leetcode.com/problems/subsets/) | [Java]()|Medium|09/17|記住helper(,,,i+1)|
