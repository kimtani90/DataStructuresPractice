/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {

    Node temp=head;
   
    
    if(head!=null && head.next!=null){
        Node predecessor = null;
        Node successor = null;
        
        
        while(temp!=null){           
            successor=temp;
            temp=temp.next;
            
            successor.next=predecessor;
            predecessor=successor;         
            
            
        }

        head=successor;
    }
    return head;
}
