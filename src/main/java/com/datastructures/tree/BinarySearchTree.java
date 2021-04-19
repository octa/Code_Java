package com.datastructures.tree;

public class BinarySearchTree {

    Node root;

    public Node insertIteratively(Node root, int value) {

        if(root == null) {
            root = new Node();
            root.value = value;
            return root;
        }

        Node curr_node = root;

        while(true) {

            if(curr_node.value <= value) {

                if(curr_node.right != null) {
                    curr_node = curr_node.right;
                }
                else {
                    curr_node.right = new Node(value);
                    break;
                }
            }
            else {
                if(curr_node.left != null) {
                    curr_node = curr_node.left;
                }
                else {
                    curr_node.left = new Node(value);
                    break;
                }
            }

        }

        return root;

    }

    /*public Tree insertRecursively(Tree root, int value) {

    }*/

    public static void main(String[] args) {

    }


}
