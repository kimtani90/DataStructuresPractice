	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        int lht=0,rht=0;
		
		if(root==null){
			return 0;
		}
		
		if(root.left!=null){
			lht=1+height(root.left);
		}
		
		if(root.right!=null){
			rht=1+height(root.right);
		}
		
		
		return lht>rht?lht:rht;
    }
