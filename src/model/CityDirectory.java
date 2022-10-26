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
public class CityDirectory {
    ArrayList<City> cityList;
    
    public CityDirectory(){
        this.cityList = new ArrayList();
//        City c = new City ("manipal",null);
//        City c2 = new City ("bangalore",null);
//        City c3 = new City ("hyderabad",null);
//        cityList.add(c);
//        cityList.add(c2);
//        cityList.add(c3);
      
        
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addNewcity(City newCity){
        cityList.add(newCity);
        return newCity;
    }
    
    
   
    
}
