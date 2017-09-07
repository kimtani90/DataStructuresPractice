package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class DeleteElement {
	
	private static void deleteNode(Node n){
		n.d=n.next.d;
		n.next=n.next.next;
		
		
	}
}
