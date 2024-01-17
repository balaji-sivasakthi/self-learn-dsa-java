package Tree.DepthFirstValues;

import java.util.Stack;

public class Solution {
    static class Node {
        String data;
        Node left;
        Node right;
        Node(String data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void depthFirstSearch(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node current = stack.pop();
            System.out.println(current.data);
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }
    public static void main(String[] args){
        /*
         *           a
         *          / \
         *         b   c         |     |
         *        / \    \       |     |
         *       d   e    f      |__a__|    a b e d c f
         *
         * */

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.left = b;
        a.right = c;
        b.left= d;
        b.right = e;
        c.right = f;

        depthFirstSearch(a);

    }
}