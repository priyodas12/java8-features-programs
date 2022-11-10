package io.dataStructure.linkedList;

public class SingleLinkedList {
    private Node start;

    public SingleLinkedList() {
        start = null;
    }

    public void addElementAtLast(Node node){
        Node tobeAdded=node;
        Node iterateOverNodes;
        if(start==null){
            System.out.println("Empty Single LinkedList...adding single element: "+tobeAdded.data);
            start=tobeAdded;
            return;
        }
        iterateOverNodes=start;
        while(iterateOverNodes.nextNode!=null){
            iterateOverNodes=iterateOverNodes.nextNode;
        }
        iterateOverNodes.nextNode=tobeAdded;
        System.out.println("Added element "+tobeAdded.data+" in Single LinkedList");
    }

    public void addElementInBegining(Node node){
        Node tobeAdded=node;
        if(start==null){
            System.out.println("Empty Single LinkedList...adding single element: "+tobeAdded.data);
            start=tobeAdded;
            return;
        }
        tobeAdded.nextNode=start;
        start=tobeAdded;
        System.out.println("Added element "+tobeAdded.data+" in Single LinkedList at first");
    }

    public void addElementAfterNode(int afterNode,Node node){
        Node tobeAdded=node;
        Node iterationNode=start;
        while(iterationNode!=null) {
            if (iterationNode.data == afterNode) {
                break;
                //hold here
            }
            iterationNode=iterationNode.nextNode;
        }
        if(iterationNode==null){
            System.out.println(afterNode+" is absent in single linked list");
            return;
        }
        else{
            tobeAdded.nextNode=iterationNode.nextNode;
            iterationNode.nextNode=tobeAdded;
        }
    }

    public void addElementBeforeNode(int beforeNode,Node node){
        Node tobeAdded=node;
        Node iterationNode=start;
        while(iterationNode.nextNode!=null) {
            if (iterationNode.nextNode.data == beforeNode) {
                break;
                //hold here
            }
            iterationNode=iterationNode.nextNode;
        }
        if(iterationNode.nextNode==null){
            System.out.println(beforeNode+" is absent in single linked list");
        }
        else{
            tobeAdded.nextNode=iterationNode.nextNode;
            iterationNode.nextNode=tobeAdded;
        }
    }


    public void displaySingleLinkedList(){
        Node iterationNode;
        if(start==null){
            System.out.println("Empty Single LinkedList");
            return;
        }
        iterationNode=start;
        while(iterationNode!=null){
            System.out.println(iterationNode.data);
            iterationNode=iterationNode.nextNode;
        }
        System.out.println();
    }
}
