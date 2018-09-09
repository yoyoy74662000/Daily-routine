# BFS - 最省時省力的算法

## BFS in Binary Tree
樹是圖的一種特殊狀態。
- 層級遍歷我需要一個int size 紀錄每一層有的結點數。

```java
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    if(root == null) {
      return results;
    }
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.offerLast(root);
    
    while(!queue.isEmpty()) {
      List<Integer> res = new ArrayList<>();
      int size = queue.size();
      for(int i = 0; i < size; i++){
        TreeNode cur = queue.pollFirst();
        if(cur.left != null){
          queue.offerLast(cur.left);    
        }
        if(cur.right != null) {
          queue.offerLast(cur.right);
        }
        res.add(cur.val);
      }
      results.add(res);
    }
    return results;
    }
  }
```
[101 Symmetric Tree]
```java
public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left, root.right);
    }

    public static boolean symmetric(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p.val != q.val) return false;
        else{
            return symmetric(p.left, q.right) && symmetric(p.right, q.left);
        }
    }
```
[102 Binary Tree Level Order Traversal]
```java
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        helper(res, queue, root);
        return res;
    }

    public void helper(List<List<Integer>> res, Queue<TreeNode> queue, TreeNode root){
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                list.add(cur.val);
            }
            res.add(0, list);
        }
    }
```
[103 Binary Tree Zigzag Level Order Traversal]
```java
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        helper(res, queue, root);
        return res;
    }

    public void helper(List<List<Integer>> res, Queue<TreeNode> queue, TreeNode root){
        boolean x = true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                // if true 的話由左到右
                if(x){
                    list.add(cur.val);
                }else{
                    //如果是false的話 由右到左
                    list.add(0,cur.val);
                }
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            x = x ? false : true;
            res.add(list);
        }
    }
```
[107 Binary Tree Level Order Traversal II]
```java
 public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // list 裡面的object 的list 裡面的object 是 Integer
        List<List<Integer>> result = new ArrayList<>();
        if( root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        // 先add 後poll
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            // and add into a list
            List<Integer> list = new ArrayList<>();
            for(int i =0; i < size; i++){
                TreeNode cur = queue.poll();
                // 3.left
                if(cur.left != null) queue.offer(cur.left);
                // 3.right
                if(cur.right != null) queue.offer(cur.right);
                // 這裏就是add 3 into list
                list.add(cur.val);
            }
            result.add(0,list) ;
        }
        return result;
    }
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
[101 Symmetric Tree]
```java
```
