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
public class HouseDirectory {
 
    ArrayList<House> houseList;
    
    public HouseDirectory(){
   
        this.houseList = new ArrayList();
    }
    
    public House addnewHouse(House newHouse){
        houseList.add(newHouse);
        return newHouse;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    
}
