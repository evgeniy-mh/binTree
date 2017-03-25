/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintree;

/**
 *
 * @author evgeniy
 */
public class Node{
    int n;
    Node left,right;
    
    public Node(){n=0; left=null; right=null;}
    public Node(int n){
        this.n=n;
        left=null; 
        right=null;
    }
    public Node(int n,Node left,Node right){
        this.n=n;
        this.left=left;
        this.right=right;
    }

}