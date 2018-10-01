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
|96|[Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/) | [Java]()|Medium|08/20|記住dp count[i] = count[i] + count[j] * count[i - j - 1];|
|98|[Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | [Java]()|Medium|08/15|recursion helper(TreeNode root, Integer min, Integer max)|
|100|[Same Tree](https://leetcode.com/problems/same-tree/) | [Java]()|Easy|08/13|three if then recursion|
|101|[Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | [Java]()|Easy|08/13|use on helper then three if then recursion|
|102|[Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | [Java]()|Medium|08/13|use Queue<TreeNode> queue = new LinkedList<>(); 注意是 LinkedList<>()|
|103|[Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | [Java]()|Medium|08/15|helper 使用queue，再使用boolean x = true，最後 x = x ? false : true|
|104|[Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | [Java]()|Easy|08/15|Math.max recursion|
|105|[Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [Java]()|Medium|08/21|透過preOder找Root，用Root透過inOrder找到Left和Right，透過Left長度找到左右節點的newRoot，重複不斷找Root的工作，直到Start > End得到新樹。Preorder的第一個值，必定為 Root．在InorderMap中找到該Root，以左的值必定為 Left ， 以右必定為 Right (因為Inorder先走完Left Child才會到Root)|
|107|[Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) | [Java]()|Easy|08/15|類似Binary Tree Level Order Traversal，然後res.add(0, list)|
|108|[Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | [Java]()|Easy|08/16|helper then 找mid then recursion|
|109|[Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/) | [Java]()|Medium|08/17|helper then 用 two pointer 找 mid then recursion|
|110|[Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | [Java]()|Easy|08/15|類似 Maximum Depth of Binary Tree 然後再 helper(root) != -1|
|111|[Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | [Java]()|Easy|08/13|use on helper then Max and Min|
|112|[Path Sum](https://leetcode.com/problems/path-sum/) | [Java]()|Easy|08/13|recursion 注意使用 sum == root.val 最後一個值|
|113|[Path Sum II](https://leetcode.com/problems/path-sum-ii/) | [Java]()|Medium|08/13|create one helper 在使用相同邏輯(path sum) sum == root.val res.add(new ArrayList<>(list));|
|114|[Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/) | [Java]()|Medium|08/21|recursion right left then assign root = prev|
|116|[Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/) | [Java]()|Medium|08/22|特別要記住  兩個if 迴圈裡的判斷式|
|117|[Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii) | [Java]()|Medium|08/23|在用 currentChild(root.left) 指向root.right (先判斷root.right是否為null)，接著移動到currentChild.next上(等於在root.right上)結束left and right後，將root指向root.next（如果此時沒有next會指向null，如果有會指向同一層的右邊節點)，兩層的while loops，內層的在做層級遍歷，外層的在做深度遍歷，外層結束即得到新的樹。
結束內層的while loop後，必須讓 root = tempChild.next 也就是他的左子樹，代表進入下一層。|
|124|[Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | [Java]()|Hard|08/15|類似 Maximum Depth of Binary Tree 只是 Math.max(left,right) + root.val，記得 int left right 裡面是 Math.max(0, helper())|
|129|[Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/) | [Java]()|Medium|08/14|create one helper then int left + right|
|144|[Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | [Java]()|Medium|08/13|use stack then 注意 right left 順序|
|145|[Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | [Java]()|Hard|08/13|use stack then 注意 left right 順序|
|173|[Binary Search Tree Iterator](https://leetcode.com/problems/binary-tree-postorder-traversal/) | [Java]()|Medium|08/16|use stack|
|199|[Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | [Java]()|Medium|08/15|使用queue 然後 if(i == 0) list.add(cur.val);|
|222|[Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/) | [Java]()|Medium|08/23|先算深度 在 遞歸|
|226|[Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | [Java]()|Easy|08/14|helper recursion 再做交換|
|230|[Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | [Java]()|Medium|08/16|helper then if(count == 0) res = root.val;|
|235|[Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [Java]()|Easy|08/17|recursion then if else|
|236|[Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | [Java]()|medium|08/19|比大小 recursion|
|257|[Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | [Java]()|Easy|08/14|helper recursion|
|270|[Closest Binary Search Tree Value](https://leetcode.com/problems/closest-binary-search-tree-value/) | [Java]()|Easy|08/19|理解這個 recursion|
|285|[Inorder Successor in BST](https://leetcode.com/problems/inorder-successor-in-bst/) | [Java]()|Easy|08/20|recursion|
|298|[Binary Tree Longest Consecutive Sequence](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/) | [Java]()|medium|08/14|recursion meet target max++ helper(root.left, max, root.val + 1);|
|563|[Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt) | [Java]()|Easy|10/01|post order|
