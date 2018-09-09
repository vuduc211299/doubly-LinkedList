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
public class DNode { // define class of a node in doubly linklist
    private DNode next;
    private DNode prev;
    private String element;
    /*
    * Constructor of class
    
    */
    public DNode(DNode n, DNode p, String e){
        next = n;
        prev = p;
        element = e;
    }
    
    public void setElement(String em){ element = em; }
    /* Set next Node of this Node*/
    public void setNext(DNode newNext) {next = newNext;}
    /* Set previous Node of this Node*/
    public void setPrev(DNode newPrev){prev = newPrev;}
    
    /* Return next Node of this Node*/
    public DNode getNext(){return next;}
    /* Return previous Node of this Node*/
    public DNode getPrev(){return prev;}
    /* Return String element of this Node*/
    public String getElement(){return element;}

}
