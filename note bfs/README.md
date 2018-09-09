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
[111 Minimum Depth of Binary Tree]
```java
public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null || root.right == null){
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }else{
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
```
[127 Word Ladder]
```java
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if (set.contains(beginWord)) {
            set.remove(beginWord);
        }
        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put(beginWord, 1);
        queue.offer(beginWord);
        while (!queue.isEmpty()) {
            String word = queue.poll();
            int curLevel = map.get(word);
            for (int i = 0; i < word.length(); i++) {
                char[] wordUnit = word.toCharArray();
                for (char j = 'a'; j <= 'z'; j++) {
                    wordUnit[i] = j;
                    String temp = new String(wordUnit);
                    if (set.contains(temp)) {
                        if (temp.equals(endWord)) {
                            return curLevel + 1;
                        }
                        map.put(temp, curLevel + 1);
                        queue.offer(temp);
                        set.remove(temp);
                    }
                }
            }
        }
        return 0;
    }
```
[130 Surrounded Regions]
```java
public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;

        int m = board.length - 1; // row 長度
        int n = board[0].length -1; // col 長度
        // row 邊界
        for(int i = 0; i <= m; i++){ //最左右兩邊
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][n] == 'O'){
                dfs(board, i, n);
            }
        }
        // col 邊界
        for(int i = 0; i <= n; i++){ //最上下兩邊
            if(board[0][i] == 'O'){
                dfs(board, 0, i);
            }
            if(board[m][i] == 'O'){
                dfs(board, m, i);
            }
        }
        // 遍歷Ｏ變成Ｘ
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == '1'){
                    board[i][j] = 'O';
                }
            }
        }

    }
    //  這裡就是dfs
    private void dfs(char[][] board, int i, int j){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O' ){
            return;
        }
        board[i][j] = '1';
        dfs(board, i, j+1);
        dfs(board, i, j-1);
        dfs(board, i+1, j);
        dfs(board, i-1, j);
    }
```
[199 Binary Tree Right Side View]
```java
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        helper(list, queue, root);
        return list;
    }
    public void helper(List<Integer> list, Queue<TreeNode> queue, TreeNode root){
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                if(i == 0){
                    list.add(cur.val);
                }
                if(cur.right != null) queue.offer(cur.right);
                if(cur.left != null) queue.offer(cur.left);
            }
            
        }
    }
```
[200 Number of Islands]
```java
public int numIslands(char[][] grid) {
        int res = 0;
        if(grid.length == 0) return 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] =='1'){
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    
    public static void dfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        else{
            grid[i][j] = '0';
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
        }
    }
```
[286 Walls and Gates
```java
public void wallsAndGates(int[][] rooms) {
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[0].length; j++){
                if(rooms[i][j] == 0){
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }
    
    public static void dfs(int[][] rooms, int i, int j, int dis){
        if(i < 0 || i >= rooms.length || j < 0 ||  j >= rooms[0].length || rooms[i][j] < dis) return;
        else{
            rooms[i][j] = dis;
            dfs(rooms, i, j - 1, dis + 1);
            dfs(rooms, i, j + 1, dis + 1);
            dfs(rooms, i - 1, j, dis + 1);
            dfs(rooms, i + 1, j, dis + 1);
        }
    }
```
