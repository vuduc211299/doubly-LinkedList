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
public class TestDoublyLinkedList {
    public static void main(String[] args){
        DNode node = new DNode(null,null,"John");
        DNode node1 = new DNode(null,null,"Jack");
        DNode node2 = new DNode(null,null,"Banana");
        DList nodeList = new DList();
        nodeList.addFirst(node);
        nodeList.addFirst(node1);
        nodeList.addAfter(node,node2);
        //nodeList.removeLast();
        String result;
        result = nodeList.toString();
        System.out.println(result);
    }
}
