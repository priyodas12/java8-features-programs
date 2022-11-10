package io.dataStructure.linkedList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
   SingleLinkedList linkedList=new SingleLinkedList();
        linkedList.addElementAtLast(new Node(11));
        linkedList.addElementAtLast(new Node(12));
        linkedList.addElementAtLast(new Node(13));
        linkedList.addElementAtLast(new Node(14));
        linkedList.addElementAtLast(new Node(19));
        linkedList.addElementAfterNode(15,new Node(16));
        linkedList.addElementBeforeNode(21,new Node(17));
        linkedList.addElementInBegining(new Node(8));
        linkedList.addElementInBegining(new Node(7));
        linkedList.addElementAtLast(new Node(20));
        linkedList.displaySingleLinkedList();
    }
}
