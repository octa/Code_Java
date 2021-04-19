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

    public static Node insertRecursively(Node root, int value) {

        if(root == null) {
            root = new Node(value);
            return root;
        }

        if(root.value <= value) {
            root.right = insertRecursively(root.right, value);
        }
        else {
            root.left = insertRecursively(root.left, value);
        }

        return root;

    }

    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = {15, 10, 20, 8, 12, 16, 25};

        Node root = null;
        for(int val: values) {
            root = insertRecursively(root, val);
        }

        inorder(root);
    }


}
