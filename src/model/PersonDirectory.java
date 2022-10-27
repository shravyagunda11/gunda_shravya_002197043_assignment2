/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
public class PersonDirectory {
    static ArrayList<Person> personList;
    
        public PersonDirectory (){
          
       this.personList = new ArrayList();


    }
        
        

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(Person newPerson){
        personList.add(newPerson);
        return newPerson;
    }  
}
