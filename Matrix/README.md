# Matrix
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
|48|[Rotate Image](https://leetcode.com/problems/rotate-image/) | [Java]()|Medium|08/31|先斜對角，在左右對稱|
|54|[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | [Java]()|Medium|08/31|記住|
|59|[Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/) | [Java]()|Medium|08/31|記住|
|73|[Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | [Java]()|Medium|08/31|一個是從座標 (0,0)，一個是由端點往下往右|
|74|[Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | [Java]()|Medium|08/31|可以用binary search但不好用。從右上角 m++ or n--|
|79|[Word Search](https://leetcode.com/problems/word-search/) | [Java]()|Medium|08/31|backtracking if迴圈裡有 exist function，exist function 裡面有 backtracking|
|240|[Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | [Java]()|Medium|08/31|從右上角 m++ or n--|
