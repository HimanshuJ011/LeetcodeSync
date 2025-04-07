/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.offer(root);

        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();

                if (leftToRight) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val);
                }

                if (node.left != null) {
                    nodesQueue.offer(node.left);
                }
                if (node.right != null) {
                    nodesQueue.offer(node.right);
                }
            }
            leftToRight = !leftToRight;
            result.add(list);
        }
        return result;
    }
}
