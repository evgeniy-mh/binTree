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
public class mainCl {
    public static void main(String[] args) {
        BinTree bt=new BinTree();
        try{
        /*bt.insert(5);
        bt.insert(7);
        bt.insert(4);
        bt.insert(3);
        bt.insert(2);
        bt.insert(-5);
        bt.insert(-4);*/
        
        for(int i=0;i<10;i++){
            int r=(int)(Math.random()*10);
            if(!bt.find(r)) bt.insert(r);
        }
        
        }
        catch(AddElementException ex){
            System.out.println(ex);            
        }
        System.out.println(bt.find(4949));
        bt.printTree();
        System.out.println("min="+bt.minimum(bt.getRootNode()).n);
        System.out.println("max="+bt.maximum(bt.getRootNode()).n);
        
        
    }
}
