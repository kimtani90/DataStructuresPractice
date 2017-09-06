package linkedlist;

public class ListPartition {

	public static void main(String[] args) {
		int[] list = {3,1,4,5,6,2,1,7,3};
		
		Node head=new Node();
		head.d=list[0];
		Node prev=head;
		
		for(int i:list){
			Node n=new Node();
			n.d=i;
			prev.next=n;
			prev=n;
			
		}
		
		Node nd=partition(head, 4);
		
		while(nd!=null){
			System.out.println(nd.d);
			nd=nd.next;
		}
       
	}
	
	public static Node partition(Node head, int part){
		
		if(head==null || head.next==null)
			return head;
		
		Node left= new Node();
		Node right=new Node();
		
		Node temp=head;
		Node temp1=left;
		Node temp2=right;
		
		while(temp!=null){
			
			Node n=new Node();
			if(temp.d<part){
				n.d=temp.d;
				temp1.next=n;
				temp1=n;
			}
			
			else{
				n.d=temp.d;
				temp2.next=n;
				temp2=n;
			}
			
			temp=temp.next;
		}
		
		if(left.next==null){
			return right.next;
		}
		else{
			left=left.next;
		}
		
		if(right.next==null){
			return left.next;
		}
		else{
			right=right.next;
		}
			
		if(left.next!=null && right.next!=null){
			
			temp1.next=right;
		}
		
		return left;
			
		
		
	}
}
