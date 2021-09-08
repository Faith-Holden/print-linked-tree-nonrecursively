package solution;

public class TreeNodeNonrecursivePrinter {

    public static void print(TreeNode root){
        Queue.enqueue(root);
        ListNode listNode;
        while(Queue.head!=null){
            listNode = Queue.dequeue();
            TreeNode treeNode;
            if(listNode==null){
                System.out.println("The list was empty.");
                return;
            }else{
                treeNode = listNode.getNode();
            }
            System.out.println(treeNode.doubleItem);
            if (treeNode.left != null) {
                Queue.enqueue(treeNode.left);
            }
            if (treeNode.right != null) {
                Queue.enqueue(treeNode.right);
            }
        }
    }

    private static class Queue{
        static ListNode head;
        static ListNode tail;

        static void enqueue(TreeNode addNode){
            ListNode nodeToAdd = new ListNode(addNode);
            if(head==null){
                head = nodeToAdd;
                tail = nodeToAdd;
            }else{
                tail.next = nodeToAdd;
                tail = tail.next;
            }
        }

        static ListNode dequeue(){
            if (head == null) {
                return null;
            }else{
                ListNode node = head;
                if(head.next!=null){
                    head = head.next;
                }else{
                    head = null;
                    tail = null;
                }
                return node;
            }
        }
    }


}
