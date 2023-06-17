public class TreeNodeUse {

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        TreeNode<Integer> node1 = new TreeNode<Integer>(20);
        TreeNode<Integer> node2 = new TreeNode<Integer>(30);
        TreeNode<Integer> node3 = new TreeNode<Integer>(40);
        TreeNode<Integer> node4 = new TreeNode<Integer>(50);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);

        System.out.println(root.data);
    }
    
}
