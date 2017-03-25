/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintree;

public class BinTree {

    private Node beg;

    public BinTree() {
        beg = new Node(0);
    }

    public BinTree(int n) {
        beg = new Node(n);
    }
    
    public Node getRootNode() {
        return beg;
    }
    
    public Node find(int n){
        Node pv = beg;
        boolean found = false;
        while (pv != null && !found) {
            if (n == pv.n) {
                found = true;
            } else if (n < pv.n) {
                pv = pv.left;
            } else {
                pv = pv.right;
            }
        }
        if(!found) return null;
        return pv;
    }
    
    
    public Node minimum(Node n){
        if(n.left==null) return n;
        else return minimum(n.left);
    }
    
    public Node maximum(Node n){
        if(n.right==null) return n;
        else return maximum(n.right);
    }
    
    public Node insert(int n) throws AddElementException {
        Node pv = beg, prev = null;
        boolean found = false;

        while (pv != null && !found) {
            prev = pv;
            if (n == pv.n) {
                found = true;
            } else if (n < (pv.n)) {
                pv = pv.left;
            } else {
                pv = pv.right;
            }
        }

        if (found) {
            throw new AddElementException();
        }

        Node newNode = new Node(n);
        if (n < prev.n) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        return newNode;

    }
    
    private Node delete(Node root, int k){
        
        if(root==null) return root;
        
        if(k<root.n){
            root.left=delete(root.left,k);
        }else if(k>root.n){
            root.right=delete(root.right,k);
        }else if(root.right!=null && root.left!=null){
            root.n=minimum(root.right).n;
            root.right=delete(root.right,root.n);
        }else if(root.left!=null){
            root=root.left;
        } else {
            root=root.right;
        }
        return root;
    }
    
    public void delete(int n){
        delete(beg,n);
    }

    private void printTree(Node n, int level) {
        if (n != null) {
            printTree(n.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(n.n);
            printTree(n.left, level + 1);
        }
    }

    public void printTree() {
        Node pv = beg;
        printTree(pv, 0);
        System.out.println();
    }

    
}
