/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    Node tempA=headA;
    Node tempB=headB;
    while (tempA!=tempB){
        
        if(tempA==null){
            tempA=headB;
        }
        else if (tempB==null){
            tempB=headA;
        }
        tempA=tempA.next;
        tempB=tempB.next;
    }
    return tempA.data;

}
