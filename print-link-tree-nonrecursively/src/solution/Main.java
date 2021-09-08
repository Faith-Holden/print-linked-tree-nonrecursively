package solution;

public class Main {
    public static void main(String[]args){
        BinaryTree testBinaryTree = new BinaryTree();
        int counter = 0;
        System.out.println("Inserted:");
        while(counter<10){
            TreeNode node = new TreeNode((int)(Math.random()*25));
            testBinaryTree.insertRandomly(node);
            System.out.println(node.doubleItem);
            counter++;
        }
        System.out.println("Printed");
        TreeNodeNonrecursivePrinter.print(testBinaryTree.root);
    }
}
