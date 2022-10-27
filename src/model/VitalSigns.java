/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shravyagunda
 */
public class VitalSigns {
    int bp;
    int weight;
    int height;
    int temp;

    public VitalSigns(int bp, int weight, int height, int temp) {
        this.bp = bp;
        this.weight = weight;
        this.height = height;
        this.temp = temp;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    
    public int toInt(){
     return bp;
    }
    
  
    
}
