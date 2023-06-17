import java.util.Scanner;

public class TreeNodeUse {

    public static TreeNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node value : ");
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter the no of children for root " + n);
        int numChild = sc.nextInt();
        for(int i = 0; i<numChild; i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }

        return root;

    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInput();


        // TreeNode<Integer> root = new TreeNode<Integer>(10);
        // TreeNode<Integer> node1 = new TreeNode<Integer>(20);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(30);
        // TreeNode<Integer> node3 = new TreeNode<Integer>(40);
        // TreeNode<Integer> node4 = new TreeNode<Integer>(50);

        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node1.children.add(node4);

        // System.out.println(root.data);
    }
    
}
