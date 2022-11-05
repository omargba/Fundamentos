/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likenlist;


/**
 *
 * @author OMAR
 */
public class Node {
  public int value;
  Node next, back;
  
    public Node(int value, Node next, Node back){
    this.value = value;
    this.next = next;
    this.back = back;
    
    
}
  public Node(int value){
      //this.value = value;
      this(value,null, null);
  }







}
