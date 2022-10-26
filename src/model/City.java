/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */
public class City {
    String cityName;
    int area;
       CommunityDirectory comm;

  

    public City(String cityName, int area, CommunityDirectory comm) {
        this.cityName = cityName;
        this.area=area;
        this.comm = comm;
    }

    
   
  public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
 
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

 

    public CommunityDirectory getComm() {
        return comm;
    }

    public void setComm(CommunityDirectory comm) {
        this.comm = comm;
    }

   public String toString(){
       return cityName;
   }
    
}
