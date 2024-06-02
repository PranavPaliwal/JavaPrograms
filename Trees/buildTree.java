import java.util.*;
public class buildTree {

// Define a Node class to represent each node in the binary tree.

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
// Define a binaryTree class to build and manage the binary tree.

    static class binrayTree{
        
// Initialize an index variable to keep track of the current position in the array

        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,4,-1,-1,5,-1,-1,6,-1,7,-1,-1};
        binrayTree tree=new binrayTree();

        Node treeNode=tree.buildtree(arr);
        System.out.println(treeNode.data);
    }
}
