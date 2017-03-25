/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bintree;

public class BinTree {

    private Node beg;
    
    public BinTree(){ 
        beg=new Node(0);
    }    
    public BinTree(int n){ 
        beg=new Node(n);
    }
    
    private boolean find(int n, Node prev){ //запишет в prev родительэлемента
        Node pv=beg;
        boolean found=false;
        while(pv!=null && !found){
            prev=pv;
            if(n==pv.n) found=true;
            else if(n <pv.n) pv=pv.left;
            else pv=pv.right;            
        }
        return found;
    }
    
    public Node insert(int n){
        Node prev = null;
        boolean found=find(n,prev);
       
        
        if(found){
            //сделай  кастомное исключениe
        }
        
        Node newNode=new Node(n);
        if(n<prev.n) prev.left=newNode;
        else prev.right=newNode;
        
        return newNode;
    }
    
    private void printTree(Node n, int level){
        if(n!=null){
             printTree(n.right, level+1);
            for(int i=0;i<level;i++) System.out.print("   ");
            System.out.println(n.n);
            printTree(n.left,level+1); 
        }
    }
    
    public void printTree(){
        Node pv=beg;
        printTree(pv, 0);
        System.out.println();
    }    
}
