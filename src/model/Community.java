/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */
public class Community {
   String communityName;
   HospitalDirectory hosp;
   HouseDirectory house;
   double area;
   String cityName;


    public Community(String communityName, HospitalDirectory hosp, HouseDirectory house, double area,String cityName) {
        this.communityName = communityName;
        this.hosp = hosp;
        this.house = house;
        this.area = area;
       this.cityName=cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public HospitalDirectory getHosp() {
        return hosp;
    }

    public void setHosp(HospitalDirectory hosp) {
        this.hosp = hosp;
    }

    public HouseDirectory getHouse() {
        return house;
    }

    public void setHouse(HouseDirectory house) {
        this.house = house;
    }
   
    
    public String toString(){
        return communityName;
    }
   
   
    
}
