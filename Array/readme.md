# Array

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
|4|[Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [Java]()|Hard|08/02|deep copy but time:(m+n) not O(log(m+n))|
|11|[Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | [Java]()|Medium|08/02|start end Math.max|
|26|[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Java]()|Easy|08/02||
|27|[Remove Element](https://leetcode.com/problems/remove-element/) | [Java]()|Easy|08/02||
|53|[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | [Java]()|Easy|08/06|//比較當前的位置，和當前位置＋前面的|
|55|[Jump Game](https://leetcode.com/problems/jump-game) | [Java]()|Easy|08/02|index 加上自己 的 nums，貪心思想，球最大值|
|56|[Merge Intervals](https://leetcode.com/problems/merge-intervals/) | [Java]()|Medium|08/03||
|57|[Insert Intervals](https://leetcode.com/problems/insert-interval/) | [Java]()|Hard|08/03||
|75|[Sort Colors](https://leetcode.com/problems/sort-colors/) | [Java]()|medium|08/03|類似two pointer|
|80|[Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii) | [Java]()|Medium|08/02|類似 two pointer|
|88|[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | [Java]()|Easy|08/06|使用two pointer & swap function|
|121|[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java]()|Easy|08/02|math.min|
|122|[Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java]()|Easy|08/02||
|152|[Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | [Java]()|Medium|08/06||
|189|[Rotate Array](https://leetcode.com/problems/rotate-array/) | [Java]()|Easy|08/02|用swap int temp = nums[start];nums[start] = nums[end]; nums[end] = temp;|
|209|[Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | [Java]()|Medium|08/06|two pointer|
|217|[Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | [Java]()|Easy|08/02|bruce or HashMap|
|228|[Summary Ranges](https://leetcode.com/problems/summary-ranges) | [Java]()|Medium|09/30|前後 array|
|238|[Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | [Java]()|Medium|08/06|要記住|
|243|[Shortest Word Distance](https://leetcode.com/problems/shortest-word-distance) | [Java]()|Easy|09/30|要記住|
|244|[Shortest Word Distance II](https://leetcode.com/problems/shortest-word-distance-ii) | [Java]()|Medium|09/30|要記住 HashMap to record 位置|
|245|[Shortest Word Distance III](https://leetcode.com/problems/shortest-word-distance-iii) | [Java]()|Medium|09/30|要記住 for loop 裡面用 if if if 類似 指針|
|280|[Wiggle Sort](https://leetcode.com/problems/wiggle-sort/) | [Java]()|Medium|08/06||
|283|[Move Zeroes](https://leetcode.com/problems/move-zeroes/) | [Java]()|Easy|08/06||
|287|[Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | [Java]()|Medium|08/02||
