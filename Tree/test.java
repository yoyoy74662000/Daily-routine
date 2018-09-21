public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// recursion
	public static TreeNode Insert(TreeNode root, int key) {
		if(root == null) {
			TreeNode newRoot = new TreeNode(key); 
			return newRoot;
		}
		
		if(root.val < key) {
			root.right = Insert(root.right,key);
		}else if (root.val > key) {
			root.left = Insert(root.left,key);
		}
		return root;
		
	}
	
	
	// iteration
	
	public static TreeNode insert(TreeNode root, int key) {
		if(root == null) {
			return new TreeNode(key);
		}
		
		TreeNode cur = root;
		while(cur != null) {
			if(cur.val == key) {
				return root;
			}
			else if(cur.val < key) {
				if(cur.right == null) {
					cur.right = new TreeNode(key);
					return root;
				}else {
					cur = cur.right;
				}
			}
			else {
				if(cur.left == null) {
					cur.left = new TreeNode(key);
					return root;
				}else {
					cur = cur.left;
				}
			}
		}
		return root;
	}
	
	
	public static class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { 
			   val = x; 
		   }
	}

}
