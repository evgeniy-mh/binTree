/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bintree;

class Node<T> implements Comparable<T>{
    T n;
    Node left,right;
    
    public Node(){n=null;}
    public Node(T n){
        this.n=n;
    }
    public Node(T n,Node left,Node right){
        this.n=n;
        this.left=left;
        this.right=right;
    }

    @Override
    public int compareTo(T o) {
        ///////////////////////////////////
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class BinTree<T> {

    Node beg;
    
    public BinTree(){ 
        beg=new Node<>();
    }    
    public BinTree(T n){ 
        beg=new Node<>(n);
    }
    
    public Node insert(T n){
        Node pv=beg,prev;
        boolean found;
        while(pv!=null){
            prev=pv;
            if(n==pv.n) found=true;
            //else if(n <pv.n) pv=pv.left;
            else pv=pv.right;            
        }
        
        if(found){
            //сделай  кастомное исключение
            return pv;
        }
        
        Node newNode=new Node(n);
        //if(n<prev.n) prev.left=newNode;
        else prev.right=newNode;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
