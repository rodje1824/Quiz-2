/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2_cc104;

/**
 *
 * @author DOTR
 */
public class DoublyLinkedList<E>{
    private Person header,trailer;
    private int size;
  
   public DoublyLinkedList(){
    header = new Person(null, null,null,null, null);
        trailer = new Person(header, null, null,null,null);
        header.setNextP(trailer);
        size = 0;
   }
 
       public Person getHeader() {
        return header;
    }

    
    public void setHeader(Person header) {
        this.header = header;
    }

    public Person getTrailer() {
        return trailer;
    }

    
    public void setTrailer(Person trailer) {
        this.trailer = trailer;
    }

    /**
     * @return the size
     */
    public int size() {
        return size;
    }
    
    public boolean isEmpty(){
        return size <= 0;
    }
    
    public Person first(){
        return header.getNextP();
    }
    
    public Person last(){
        return trailer.getPrevP();
    }
    

    
    private void addBetween(Person prevNode, Person newNode, Person nextNode){
        newNode.setPrevP(prevNode);
        newNode.setNextP(nextNode);
        prevNode.setNextP(newNode);
        nextNode.setPrevP(newNode);
        size++;
    }
    
    private void remove(Person node){
        node.getPrevP().setNextP(node.getNextP());
        node.getNextP().setPrevP(node.getPrevP());
        node.setNextP(null);
        node.setPrevP(null);
        size--;
    }
    
    public Person removeFirst(){
        Person temp = header.getNextP();
        remove(header.getNextP());
        return temp;
    }
    
    public Person removeLast(){
        Person temp = trailer.getPrevP();
        remove(trailer.getPrevP());
        return temp;
    }
    
    public void addFirst(Person newNode){
        addBetween(header, newNode, header.getNextP());
    }
    
    public void addLast(Person newNode){
        addBetween(trailer.getPrevP(), newNode, trailer);
    }
    
    public void showList(){

        Person<E> tempNode = header.getNextP();
        for(int i = 0; i < size; i++){
            System.out.print("[" + tempNode.getFirstname()+" "+tempNode.getLastname()+","+tempNode.getAddress()+"]");
            tempNode = tempNode.getNextP();
        }
    }
      
}
