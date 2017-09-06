package linkedlist;

public class kthToLast {

	public static void main(String[] args) {
		int[] list = {1,1,2,3,3,4,2,5,5};
		
		Node head=new Node();
		head.d=list[0];
		Node prev=head;
		
		for(int i:list){
			Node n=new Node();
			n.d=i;
			prev.next=n;
			prev=n;
			
		}
		
		Node nd=kth(head, 2);
		
		System.out.println(nd.d);
       
	}
	
	private static Node kth(Node head, int k){
		
		Node n=head;
		Node r=head;
		
		for(int i=1; i<k; i++){
			r=r.next;
		}
		
		while(r.next!=null){
			r=r.next;
			n=n.next;
		}
		
		return n;
	}
}
