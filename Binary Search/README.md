# Binary Search
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
|33|[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Java]()|Medium|08/29|binary search，注意(nums[start] < nums[mid])另一個不是|
|34|[Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Java]()|Medium|08/29|非常注意|
|35|[Search Insert Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Java]()|Easy|08/29|注意 如果target 不在array 的順序|
|81|[Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | [Java]()|Easy|08/29|Search in Rotated Sorted Array 的 follow up，請記住要多加if(nums[start] == nums[mid] && nums[mid] == nums[end]){start++;end--;}|
|153|[Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | [Java]()|Medium|08/29|沒有 target 比較用 end|
|154|[Find Minimum in Rotated Sorted Array II](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | [Java]()|Hard|08/29|類似Find Minimum in Rotated Sorted Array，最後面也要end-- 避免重複|
|162|[Find Peak Element](https://leetcode.com/problems/find-peak-element/) | [Java]()|Medium|08/29|題目不是很好|
|349|[Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | [Java]()|Easy|08/30|HashSet|
|350|[Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | [Java]()|Easy|08/30|HashMap & List|
|658|[Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/description/) | [Java]()|Medium|10/04|这个解法是直接从数组里通过二分法找到应为的subarray的start位置，通过判断mid位置和mid + k位置上与x的差值的大小比较来确定二分的update rule，因此时间复杂度更好。|
