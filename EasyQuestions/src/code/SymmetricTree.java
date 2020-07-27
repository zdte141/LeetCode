package code;

/**
 * LeetCode easy questions 101 Symmetric Tree.
 * 
 * @author sanghunlee
 *
 */
public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isMirror(root.left, root.right);
  }

  public boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }
    if (t1 == null || t2 == null) {
      return false;
    }
    if (t1.val != t2.val) {
      return false;
    }
    return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.right);
  }

  public static void main(String[] args) {
    SymmetricTree test = new SymmetricTree();

    test.isSymmetric(root);

  }
}
