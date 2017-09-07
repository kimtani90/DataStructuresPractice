package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseListGivenSize {

public static void main(String[] args) {
	
	
	int[] list = {1,2,3,4,5};
	
	Node head=new Node();
	head.d=list[0];
	Node prev=head;
	
	for(int i:list){
		Node n=new Node();
		n.d=i;
		prev.next=n;
		prev=n;
		
	}
	
	
	
	Node nd=reverse(head,3);
	
	while(nd!=null){
		System.out.println(nd.d);
		nd=nd.next;
	}
	
	
	
}
	


public static Node reverse(Node head, int k){
	String s;

	Node temp=head;
	int t=1;
	while(temp!=null){
		
		if(t<k && temp.next!=null){
			Node curr=temp;
			curr=temp.next;
			curr.next=temp;
			
			t++;
		}
		else{
			t=1;
		}
		temp=temp.next;
	}
	
	return head;
	
}
}