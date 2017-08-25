/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method

    Node temp = head;
    Node predecessor = null;
    int count =0;
    
    while(temp!=null){
        
        if(count==position){
            
            if(position!=0){
                predecessor.next=temp.next;
            }
            else{
                head=temp.next;
                temp.next=null;
            }
            return head;
        }
        count++;
        predecessor = temp;
        temp=temp.next;
    }
        return head;
}

