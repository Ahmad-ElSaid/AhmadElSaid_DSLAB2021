package DLL;
public class CircleDLL implements DLLInterface{
    
    private DLLNode head;

    public CircleDLL() {
        this.head = null;
    }

    public CircleDLL(DLLNode head) {
        this.head = head;
    }
    
     public CircleDLL(Object headValue) {
        this.head = new DLLNode(headValue);
    }
     
    public int size(){
        if(head.getNext()==null){
            return 0;
        }else{
            DLLNode current = this.head;
            int counter = 0;
            while(current.getNext()!=this.head){
                current=current.getNext();
                counter++;
            }
            return counter;
            
        }
        
        
    }
    public boolean isEmpty(){
        if(head.getNext()==null){
            return true;
        }
        else 
            return false;
    }
     @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertAtBack(Object newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertAtFront(Object newElement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  
  
}