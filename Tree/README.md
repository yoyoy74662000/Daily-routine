# Tree
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
|94|[Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | [Java]()|Medium|08/13|題目要求用 iteration 就用 stack 如果是 recursion 就用一般|
|100|[Same Tree](https://leetcode.com/problems/same-tree/) | [Java]()|Easy|08/13|three if then recursion|
|101|[Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | [Java]()|Easy|08/13|use on helper then three if then recursion|
|102|[Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | [Java]()|Medium|08/13|use Queue<TreeNode> queue = new LinkedList<>(); 注意是 LinkedList<>()|
|111|[Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | [Java]()|Easy|08/13|use on helper then Max and Min|
|112|[Path Sum](https://leetcode.com/problems/path-sum/) | [Java]()|Easy|08/13|recursion 注意使用 sum == root.val 最後一個值|
|113|[Path Sum II](https://leetcode.com/problems/path-sum-ii/) | [Java]()|Medium|08/13|create one helper 在使用相同邏輯(path sum) sum == root.val res.add(new ArrayList<>(list));|
|129|[Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/) | [Java]()|Medium|08/13|create one helper then int left + right|
|144|[Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | [Java]()|Medium|08/13|use stack then 注意 right left 順序|
|145|[Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | [Java]()|Hard|08/13|use stack then 注意 left right 順序|
|226|[Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | [Java]()|Easy|08/14|helper recursion 再做交換|
|257|[Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | [Java]()|Easy|08/13|helper recursion|
