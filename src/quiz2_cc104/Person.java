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
public class Person<E>{

    private String Firstname, Lastname, Address;
    private Person NextP, PrevP;
    
    public Person(Person prevP, String Firstname, String lastname, String Address, Person nextP){
    
        this.PrevP = prevP;
        this.Firstname = Firstname;
        this.Lastname = lastname;
        this.Address = Address;
        this.NextP= nextP;
  
    }

  
    public String getFirstname() {
        return Firstname;
    }

  
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

 
    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

  
    public Person getNextP() {
        return NextP;
    }

    public void setNextP(Person nextP) {
        this.NextP = nextP;
    }
    
    public Person getPrevP() {
        return PrevP;
    }

    
    public void setPrevP(Person prevP) {
        this.PrevP = prevP;
    } 
    
   
    
}
