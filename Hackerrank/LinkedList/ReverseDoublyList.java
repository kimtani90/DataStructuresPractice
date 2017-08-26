/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    Node temp=head;
    if(head==null || head.next==null){
        return head;
    }
   
    while(temp!=null){
       
        
        Node prev = temp.prev;
        temp.prev=temp.next;
        temp.next=prev;
        head=temp;
        temp=temp.prev;
        
        
        
        
    }
    return head;

}
