/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author VŨ ĐỨC
 */
public class DList {
    protected DNode header,trailer; // sentinels
    protected int num; // num of Nodes
    public DList(){
        header = new DNode(null,null,null);
        trailer = new DNode(null,header,null);
        header.setNext(trailer);
        num = 0;
    } 
    /**
    * Remove Last Node of List
    */
    public void removeLast(){
        DNode temp = trailer.getPrev(); // get Last Node
        DNode prev_temp = temp.getPrev(); // get previous Node of LastNode
        trailer.setPrev(prev_temp);
        prev_temp.setNext(trailer);
        temp.setNext(null);
        temp.setPrev(null);
        num --; //decrease num of nodes
    }
    
    /**
     * Add First
     * @param c
     */
    public void addFirst(DNode c){
        DNode first = header.getNext(); // get first Node of the list
        c.setNext(first);
        c.setPrev(header);
        first.setPrev(c);
        header.setNext(c);
        num ++;
    }
    
    /**
     * Add new Node after another node
     * @param v
     * @param z
     */
    public void addAfter(DNode v, DNode z){
        DNode temp = v.getNext();
        v.setNext(z);
        z.setPrev(v);
        z.setNext(temp);
        temp.setPrev(z);
    }    
    
    @Override
    public String toString(){
        String s = "[";
        DNode n = header.getNext(); // n is the first node in list
        // check list is empty or not
        if(n==trailer){
            return null;
        }
        else{
            while(n!=trailer){
                s += n.getElement();
                s += " ";
                n = n.getNext();
            }
            return s +"]";
        }
    }
}
