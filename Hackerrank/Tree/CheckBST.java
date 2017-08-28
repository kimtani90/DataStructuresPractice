/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        
        if(root==null){
            return false;
        }
      
        List<Integer> list= new ArrayList<>();
        
        inOrder(root, list);
        
        for(int i=0;i<list.size()-1;i++){
            
            if(list.get(i)>=list.get(i+1)){
                
                return false;
            }          
            
            
        }
        
        return true;
        
        
    }

    void inOrder(Node root, List<Integer> list){
        
        if(root==null){
            return;
        }
        inOrder(root.left, list);
        
        list.add(root.data);
        
        inOrder(root.right, list);
    }

    
