package com.gl.BSTPairSum;

import java.util.HashSet;
class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BSTPairSum {

    public static boolean isPairPresent(Node root, int sum) {
        HashSet<Integer> set = new HashSet<>();
        
        return isPairSum(root, sum, set);
    }


    public static boolean isPairSum(Node root, int sum, HashSet<Integer> set) {
    	
        if (root == null) {
            return false;
        }


        if (isPairSum(root.left, sum, set)) {
            return true;
        }

    
        if (set.contains(sum - root.key)) {
            System.out.println("(" + (sum - root.key) + ", " + root.key + ")");
            return true;
        } else {
            set.add(root.key);
        }
        
        
  
        return isPairSum(root.right, sum, set);
    }

    public static void main(String[] args) {
    	 
        Node root = new Node(40);
        root.left = new Node(20);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(50);
        root.right.right = new Node(70);

        int sum = 30;

        if (isPairPresent(root, sum)) {
            System.out.println("Pair with sum " + sum + " exists in BST");
        } else {
            System.out.println("Pair with sum " + sum + " does not exist in BST");
        }
    }
}


