   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
      
       Node temp=root;
		Queue q= new LinkedList<>();
		
		q.add(temp);
		
		while(!q.isEmpty()){
			
			Node n=(Node)q.poll();
			System.out.print(n.data+ " ");
			if(n.left!=null)
				q.add(n.left);

			if(n.right!=null)
				q.add(n.right);
			
			
		}
      
    }
