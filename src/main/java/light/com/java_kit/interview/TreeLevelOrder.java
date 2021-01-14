package light.com.java_kit.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        value = val;
    }
}

public class TreeLevelOrder {
    public static void main(String[] args) {
        ztranverse(new TreeNode(1));

        Queue<Integer> q = new LinkedList<>();


    }

    public static void ztranverse(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lslink = new ArrayList<List<Integer>>();
//        int a = queue.poll();
//        queue.offer(1);

        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < length; i++) {
                TreeNode current = queue.poll();
                list.add(current.value);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            lslink.add(list);
        }
    }
}
