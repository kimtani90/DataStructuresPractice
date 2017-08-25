/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node newNode = new Node();
    newNode.data = data;
    Node temp = head;
    
    if(head == null){
        newNode.next=null;
        head=newNode;
        return head;
    }
    
    else{
        int count = 0;
        Node predecessor = null;
        while(temp!=null){

            if(count == position){

                newNode.next=temp;

                if(position!=0){
                    predecessor.next=newNode;
                }
                else{
                    head=newNode;
                }

                return head;

            }
            count++;
            predecessor = temp;
            temp=temp.next;
        }

        
    }
        return head;
    
}
