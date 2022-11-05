
package likenlist;
import javax.swing.JOptionPane;


public class SinglyLinkedList {
  private Node start, end;

    public SinglyLinkedList() {
        this.start = this.end = null;
    }
    
    public boolean empty(){
        return start == null;
    }
    
   public void addEnd(int value){
       if (!empty()){
           end = new Node(value, null, end);
           end.back.next=end;
       } else{
           start=end=new Node(value);
       } 
   }
   
   
   public void addStart(int value){
       if (!empty()){
           start=new Node(value, start, null);
           start.next.back=start;
       }else{
           start = end = new Node(value);
       }
   }
  
   public void showLisStartEndt(){
       if (!empty()){
           String date = "<=>";
           Node aux = start;
           while(aux!=null){
               date = date+"["+aux.value+"] <=>";
               aux= aux.next;
               JOptionPane.showMessageDialog(null, date, "Muestra la lista ", JOptionPane.INFORMATION_MESSAGE);
           }
       }
   }
       public void showListEndStart(){
        if (!empty()) {
            String date="<=>";
            Node aux=end;
            while(aux!=null){
                date=date+"["+aux.value+"] <=>";
                aux=aux.back;
                JOptionPane.showMessageDialog(null, date, "Mostrar Lista de fin a inicio ", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }


  //Deleting a node from SinglyLinkedList
  public int deletionStart() {
    int element=start.value;
        if (start==end) {
            start=end=null;
            
        }else{
        start=start.next;
        start.back=null;
        
        }
        return element;
  }

//  Delete Entire SinglyLinkedList
public int deleteEnd() {
  int element=end.value;
        if (start==end) {
            start=end=null;
            
        }else{
        end=end.next;
        end.next=null;
        
        }
        return element;

}
}

