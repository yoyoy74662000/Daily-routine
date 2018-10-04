#LinkedList

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
|19|[Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [Java]()|Medium|08/23|可以用two pointer 也可以不需要|
|21|[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [Java]()|Easy|08/23|要記住看誰先走完 再一個if|
|23|[Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Java]()|Hard|08/26|類似 Merge Two Sorted Lists題目|
|24|[Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | [Java]()|Medium|08/23|two pointer ListNode first & second，注意順序不要迴圈|
|61|[Rotate List](https://leetcode.com/problems/rotate-list/) | [Java]()|Medium|08/26|記住|
|83|[Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [Java]()|Easy|08/24|cur.val|
|82|[Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | [Java]()|Medium|08/24|使用dummy 然後while裡面加一個 int 來標記指到的數字|
|86|[Partition List](https://leetcode.com/problems/partition-list/) | [Java]()|Medium|08/26|two dummy node and two pointer|
|92|[Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | [Java]()|Medium|08/24|two for loop, first one is cur & prev, second add temp = cur.next;|
|141|[Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | [Java]()|Easy|08/24|slow & fast 注意while迴圈的判斷式|
|142|[Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | [Java]()|Medium|08/24|slow & fast &slow2 注意while迴圈的判斷式，再加上一個while|
|143|[Reorder List](https://leetcode.com/problems/insertion-sort-list/) | [Java]()|Medium|08/26|請記住|
|147|[Insertion Sort List](https://leetcode.com/problems/reorder-list/) | [Java]()|Medium|08/26|請記住 reverse & merge 方法|
|147|[Sort List](https://leetcode.com/problems/sort-list/) | [Java]()|Medium|09/08|請記住 取mid 再 merge|
|160|[Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | [Java]()|Easy|08/24|a = a == null ? headB : a.next;b = b == null ? headA : b.next;|
|203|[Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) | [Java]()|Easy|08/25|dummy|
|206|[Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | [Java]()|Easy|08/25|ListNode prev then 注意while 判斷式 then ListNode temp|
|234|[Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | [Java]()|Easy|08/27|find mid then reverse|
|328|[Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) | [Java]()|Medium|08/25|類似two pointer odd, even then 注意while判斷式|
|369|[Plus One Linked List](https://leetcode.com/problems/plus-one-linked-list/) | [Java]()|Medium|08/25|two pointer and two while loop|
|876|[Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/) | [Java]()|Easy|10/04|slow and fast|
