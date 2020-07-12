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
public class Quiz2_cc104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person<String> person[] = new Person[5];
     person[0] = new Person<>(null,"Nami","Reyes","Davao",null);
     person[1] = new Person<>(null,"Roronoa","Zoro","Quezon",null);
     person[2] = new Person<>(null,"Chris","Perez","Negros",null);
     person[3] = new Person<>(null,"Rodj","Orogo","Kapalong",null);
     person[4] = new Person<>(null,"Miya","Olaer","Calinan",null);
     
     DoublyLinkedList<String> perList = new DoublyLinkedList<>();
    
        perList.addFirst(person[0]);
        perList.addFirst(person[1]);
        perList.addFirst(person[2]);
        
        System.out.println("AddFirst: ");
        perList.showList();
        
        System.out.println("\n");
        
        System.out.println("AddLast: ");
        perList.addLast(person[3]);
        perList.addLast(person[4]);
        perList.showList();
        
        System.out.println("\n");
        
        System.out.println("Remove First: ");
        perList.removeFirst();
        perList.showList();
        
        System.out.println("\n");
        
        System.out.println("Remove Last:");
        perList.removeLast();
        perList.showList();
        
    }
    
}
